import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GoalWindow extends JFrame implements ActionListener {
    public GoalWindow(String name) {
        super(name);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(640, 360));
        panel.setBackground(new Color(64, 64, 64));
        add(panel);

        JCheckBox checkbox = new JCheckBox("Lose weight");
        checkbox.addActionListener(this);
        checkbox.setFont(MainApp.menuFont);
        panel.add(checkbox);

        pack();
    }

    public void actionPerformed(ActionEvent e) {

    }
}
