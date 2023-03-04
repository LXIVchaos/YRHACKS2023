import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Equipment extends JFrame implements ActionListener {
    public static boolean[]equipmentTable = GlobalData.equipment;
    public Equipment(String name){
        super(name);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 100));
        panel.setBackground(new Color(230, 230, 230));

        add(panel);
        JLabel titleText = new JLabel("Equipment");
        titleText.setFont(MainApp.titleFont);
        titleText.setLocation(20, 0);
        titleText.setSize(300, 40);
        panel.add(titleText);

        //adding checkboxes
        JCheckBox noEquipBox = new JCheckBox("None", equipmentTable[0]);
        noEquipBox.addActionListener(this);
        noEquipBox.setFont(MainApp.menuFont);
        noEquipBox.setSize(110, 25);
        noEquipBox.setLocation(20, 40);

        JCheckBox dumbellBox = new JCheckBox("Dumbells", equipmentTable[1]);
        dumbellBox.addActionListener(this);
        dumbellBox.setFont(MainApp.menuFont);
        dumbellBox.setSize(110, 25);
        dumbellBox.setLocation(140, 40);

        JCheckBox barbellBox = new JCheckBox("Barbell", equipmentTable[2]);
        barbellBox.addActionListener(this);
        barbellBox.setFont(MainApp.menuFont);
        barbellBox.setSize(110, 25);
        barbellBox.setLocation(260, 40);

        JCheckBox benchBox = new JCheckBox("Bench", equipmentTable[3]);
        benchBox.addActionListener(this);
        benchBox.setFont(MainApp.menuFont);
        benchBox.setSize(110, 25);
        benchBox.setLocation(20, 80);

        JCheckBox cableBox = new JCheckBox("Cables", equipmentTable[4]);
        cableBox.addActionListener(this);
        cableBox.setFont(MainApp.menuFont);
        cableBox.setSize(110, 25);
        cableBox.setLocation(140, 80);

        panel.add(noEquipBox);
        panel.add(dumbellBox);
        panel.add(barbellBox);
        panel.add(benchBox);
        panel.add(cableBox);

        pack();


    }
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "None":
            equipmentTable[0] = !equipmentTable[0];
            break;
            case "Dumbells":
            equipmentTable[1] = !equipmentTable[1];
            break;
            case "Barbell":
            equipmentTable[2] = !equipmentTable[2];
            break;
            case "Bench":
            equipmentTable[3] = !equipmentTable[3];
            break;
            case "Cables":
            equipmentTable[4] = !equipmentTable[4];
            break;
        }
        GlobalData.writeUserData();
    }
}
