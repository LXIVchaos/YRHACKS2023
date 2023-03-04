import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();

        //making certain windows visible based on user input
        switch (action) {
            case "General":
                MainApp.generalGoalWindow.setVisible(true);
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

        JMenu option1 = new JMenu("Goals");
        option1.setFont(MainApp.menuFont);
        
        JMenuItem generalGoals = new JMenuItem("General");
        generalGoals.setFont(MainApp.menuFont);
        generalGoals.addActionListener(this);
        option1.add(generalGoals);

        JMenu option2 = new JMenu("User Statistics");
        option2.setFont(MainApp.menuFont);

        JMenu option3 = new JMenu("Progress");
        option3.setFont(MainApp.menuFont);
        
        mainMenuBar.add(option1);
        mainMenuBar.add(option2);
        mainMenuBar.add(option3);
        setJMenuBar(mainMenuBar);

        pack();
    }
}
