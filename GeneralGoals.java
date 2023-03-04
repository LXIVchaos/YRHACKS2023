import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GeneralGoals extends JFrame implements ActionListener {
    public static boolean[] goalTable = GlobalData.generalGoals;
    public GeneralGoals(String name) {
        super(name);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(400, 100));
        panel.setBackground(new Color(230, 230, 230));
        add(panel);

        JLabel titleText = new JLabel("General Goals");
        titleText.setFont(MainApp.titleFont);
        titleText.setLocation(20, 0);
        titleText.setSize(300, 40);
        panel.add(titleText);

        //adding checkboxes
        JCheckBox weightBox = new JCheckBox("Lose weight", goalTable[0]);
        weightBox.addActionListener(this);
        weightBox.setFont(MainApp.menuFont);
        weightBox.setSize(110, 25);
        weightBox.setLocation(20, 40);

        JCheckBox muscleBox = new JCheckBox("Gain muscle", goalTable[1]);
        muscleBox.addActionListener(this);
        muscleBox.setFont(MainApp.menuFont);
        muscleBox.setSize(110, 25);
        muscleBox.setLocation(140, 40);

        JCheckBox healthBox = new JCheckBox("Stay healthy", goalTable[2]);
        healthBox.addActionListener(this);
        healthBox.setFont(MainApp.menuFont);
        healthBox.setSize(110, 25);
        healthBox.setLocation(260, 40);

        panel.add(weightBox);
        panel.add(muscleBox);
        panel.add(healthBox);

        pack();
    }

    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Lose weight":
            goalTable[0] = !goalTable[0];
            break;
            case "Gain muscle":
            goalTable[1] = !goalTable[1];
            break;
            case "Stay healthy":
            goalTable[2] = !goalTable[2];
            break;
        }
        GlobalData.writeUserData();
    }
}
