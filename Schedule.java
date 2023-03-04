import java.awt.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.event.*;

public class Schedule extends JFrame implements ActionListener {
    public static JTextField field;
    public static boolean[] dayTable = GlobalData.workoutDays;
    public Schedule(String name) {
        super(name);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 340));
        panel.setBackground(new Color(230, 230, 230));
        panel.setLayout(null);

        JLabel datesTitle = new JLabel("Days");
        datesTitle.setBackground(new Color(255, 255, 255));
        datesTitle.setFont(MainApp.titleFont);
        datesTitle.setSize(200, 40);
        datesTitle.setLocation(10, 0);
        panel.add(datesTitle);
        
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < 7; i++) {
            JCheckBox dayBox = new JCheckBox(days[i], dayTable[i]);
            dayBox.setSize(280, 25);
            dayBox.setLocation(10, i * 30 + 50);
            dayBox.setFont(MainApp.menuFont);
            dayBox.addActionListener(this);
            panel.add(dayBox);
        }

        JLabel workoutTitle = new JLabel("Preferred workout time (minutes):");
        workoutTitle.setFont(MainApp.menuFont);
        workoutTitle.setSize(200, 25);
        workoutTitle.setLocation(10, 275);
        panel.add(workoutTitle);

        field = new JTextField(Integer.toString(GlobalData.workoutTime));
        field.setSize(50, 25);
        field.setLocation(240, 275);
        field.setFont(MainApp.menuFont);
        panel.add(field);

        JButton applyButton = new JButton("Apply");
        applyButton.setSize(280, 25);
        applyButton.setFont(MainApp.menuFont);
        applyButton.setLocation(10, 305);
        applyButton.addActionListener(this);
        panel.add(applyButton);

        add(panel);
        pack();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Apply":
                try {
                    GlobalData.workoutTime = Integer.parseInt(field.getText());
                    GlobalData.writeUserData();
                } catch (Exception x) {
                    JOptionPane.showMessageDialog(this, "Ensure that you have inputed an integer!");
                }
                break;
            case "Sunday":
                dayTable[0] = !dayTable[0];
                GlobalData.writeUserData();
                break;
            case "Monday":
                dayTable[1] = !dayTable[1];
                GlobalData.writeUserData();
                break;
            case "Tuesday":
                dayTable[2] = !dayTable[2];
                GlobalData.writeUserData();
                break;
            case "Wednesday":
                dayTable[3] = !dayTable[3];
                GlobalData.writeUserData();
                break;
            case "Thursday":
                dayTable[4] = !dayTable[4];
                GlobalData.writeUserData();
                break;
            case "Friday":
                dayTable[5] = !dayTable[5];
                GlobalData.writeUserData();
                break;
            case "Saturday":
                dayTable[6] = !dayTable[6];
                GlobalData.writeUserData();
                break;
        }
    }

    
}
