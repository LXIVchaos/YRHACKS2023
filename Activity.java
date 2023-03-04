import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Activity extends JFrame implements ActionListener {
    public Activity(String name) {
        super(name);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 100));
        panel.setBackground(new Color(230, 230, 230));

        add(panel);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    }
}
