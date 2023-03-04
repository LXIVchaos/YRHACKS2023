import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Experience extends JFrame implements ActionListener {
    public Experience(String name) {
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
