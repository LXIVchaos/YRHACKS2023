import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();

        //making certain windows visible based on user input
        switch (action) {
            case "Goals":
                MainApp.goalWindow.setVisible(true);
        }
    }
    
    public MainWindow(String name) {
        //setting up the window
        super(name);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(640, 360));
        panel.setBackground(new Color(64, 64, 64));
        add(panel);

        //menu items
        JMenuBar mainMenuBar = new JMenuBar();

        JMenuItem option1 = new JMenuItem("Goals");
        option1.setFont(MainApp.menuFont);
        option1.addActionListener(this);
        option1.setMaximumSize(new Dimension(50, 10000));

        JMenuItem option2 = new JMenuItem("User Statistics");
        option2.setFont(MainApp.menuFont);
        option2.addActionListener(this);
        option2.setMaximumSize(new Dimension(200, 10000));
        
        mainMenuBar.add(option1);
        mainMenuBar.add(option2);
        setJMenuBar(mainMenuBar);

        pack();
    }
}
