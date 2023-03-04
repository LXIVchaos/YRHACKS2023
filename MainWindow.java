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
                break;
            case "Target Weight":
                MainApp.targetWeightWindow.setVisible(true);
                break;
            case "Weight":
                MainApp.currentWeightWindow.setVisible(true);
                break;
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
        String[] menuItems = {"Goals", "User Statistics", "Constraints"};
        String[][] subItems = {{"General", "Target Weight"}, {"Weight", "Experience", "Activity Level"}, {"Equipment", "Schedule"}};
        JMenuBar mainMenuBar = new JMenuBar();
        for (int i = 0; i < menuItems.length; i++) {
            JMenu item = new JMenu(menuItems[i]);
            item.setFont(MainApp.menuFont);
            
            for (String j: subItems[i]) {
                JMenuItem x = new JMenuItem(j);
                x.setFont(MainApp.menuFont);
                x.addActionListener(this);
                item.add(x);
            }
            mainMenuBar.add(item);
        }
        setJMenuBar(mainMenuBar);

        pack();
    }
}
