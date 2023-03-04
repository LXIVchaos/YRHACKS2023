import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GeneralGoals extends JFrame implements ActionListener {
    public GeneralGoals(String name) {
        super(name);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 100));
        panel.setBackground(new Color(128, 128, 128));
        add(panel);

        JLabel titleText = new JLabel("General Goals");


        //adding checkboxes
        JCheckBox weightBox = new JCheckBox("Lose weight");
        weightBox.addActionListener(this);
        weightBox.setFont(MainApp.menuFont);

        JCheckBox muscleBox = new JCheckBox("Gain muscle");
        muscleBox.addActionListener(this);
        muscleBox.setFont(MainApp.menuFont);

        JCheckBox healthBox = new JCheckBox("Stay healthy");
        healthBox.addActionListener(this);
        healthBox.setFont(MainApp.menuFont);

        panel.add(weightBox);
        panel.add(muscleBox);
        panel.add(healthBox);

        pack();
    }

    public void actionPerformed(ActionEvent e) {

    }
}
