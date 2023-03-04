import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CurrentWeight extends JFrame implements ActionListener {
    public static JTextField field;

    public CurrentWeight(String name) {
        super(name);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(300, 80));
        panel.setBackground(new Color(230, 230, 230));
        add(panel);

        JLabel titleText = new JLabel("Choose current weight (lbs)");
        titleText.setSize(200, 25);
        titleText.setLocation(10, 10);
        titleText.setFont(MainApp.menuFont);

        field = new JTextField(Integer.toString(GlobalData.currentWeight));
        field.setSize(125, 25);
        field.setLocation(160, 10);
        field.setFont(MainApp.menuFont);

        JButton button = new JButton("Apply");
        button.setSize(260, 25);
        button.setFont(MainApp.menuFont);
        button.setLocation(20, 40);
        button.addActionListener(this);

        panel.add(titleText);
        panel.add(field);
        panel.add(button);

        pack();
    }

    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Apply":
                try {
                    GlobalData.currentWeight = Integer.parseInt(field.getText());
                    GlobalData.writeUserData();
                } catch (Exception x) {
                    JOptionPane.showMessageDialog(this, "Ensure that you have inputed an integer!");
                }
            break;
        }        
    }
}
