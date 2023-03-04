import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Experience extends JFrame implements ActionListener {
    public static boolean[]experienceTable = GlobalData.experienceLevel;
    public Experience(String name) {
        super(name);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 100));
        panel.setBackground(new Color(230, 230, 230));

        add(panel);
        JLabel titleText = new JLabel("Experience");
        titleText.setFont(MainApp.titleFont);
        titleText.setLocation(20, 0);
        titleText.setSize(300, 40);
        panel.add(titleText);

        //adding checkboxes
        JCheckBox newBox = new JCheckBox("New (None)", experienceTable[0]);
        newBox.addActionListener(this);
        newBox.setFont(MainApp.menuFont);
        newBox.setSize(110, 25);
        newBox.setLocation(140, 40);

        JCheckBox beginnerBox = new JCheckBox("Beginner (0-1 years)", experienceTable[1]);
        beginnerBox.addActionListener(this);
        beginnerBox.setFont(MainApp.menuFont);
        beginnerBox.setSize(110, 25);
        beginnerBox.setLocation(260, 40);

        JCheckBox intermediateBox = new JCheckBox("Intermediate (2-5 years)", experienceTable[2]);
        intermediateBox.addActionListener(this);
        intermediateBox.setFont(MainApp.menuFont);
        intermediateBox.setSize(110, 25);
        intermediateBox.setLocation(140, 80);

        JCheckBox advancedBox = new JCheckBox("Advanced (6+ years)", experienceTable[3]);
        advancedBox.addActionListener(this);
        advancedBox.setFont(MainApp.menuFont);
        advancedBox.setSize(110, 25);
        advancedBox.setLocation(260, 80);

        panel.add(newBox);
        panel.add(beginnerBox);
        panel.add(intermediateBox);
        panel.add(advancedBox);

        pack();


    }
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "None":
            experienceTable[0] = !experienceTable[0];
            break;
            case "beginners":
            experienceTable[1] = !experienceTable[1];
            break;
            case "intermediate":
            experienceTable[2] = !experienceTable[2];
            break;
            case "advanced":
            experienceTable[3] = !experienceTable[3];
            break;
        }
        GlobalData.writeUserData();
    }
}
