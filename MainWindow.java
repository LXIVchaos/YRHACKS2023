import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements ActionListener, Runnable {
    public static JLabel calorieLabel;
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
            case "Experience":
                MainApp.experienceWindow.setVisible(true);
                break;
            case "Equipment":
                MainApp.equipmentWindow.setVisible(true);
                break;
            case "Schedule":
                MainApp.scheduleWindow.setVisible(true);
                break;
            case "Activity Level":
                MainApp.activityWindow.setVisible(true);
                break;
        }
    }

    
    public MainWindow(String name) {
        //setting up the window
        super(name);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(640, 360));
        panel.setBackground(new Color(64, 64, 64));
        panel.setLayout(null);
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

        calorieLabel = new JLabel("Today's Calories: ");
        calorieLabel.setForeground(new Color(255, 255, 255));
        calorieLabel.setFont(MainApp.titleFont);
        calorieLabel.setLocation(10, 0);
        calorieLabel.setSize(300, 40);
        panel.add(calorieLabel);

        pack();

        Thread thread = new Thread(this);
        thread.start();
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
                int calories = 0;
                switch (GlobalData.activity) {
                    case 0:
                    calories = 1800;
                    break;
                    case 1:
                    calories = 1900;
                    break;
                    case 2:
                    calories = 2000;
                    break;
                    case 3:
                    calories = 2100;
                    break;
                    case 4:
                    calories = 2200;
                    break;

                }
                if (GlobalData.targetWeight > 0)
                    calories *= (double)(GlobalData.targetWeight + 250) / (double)(GlobalData.currentWeight + 250);
                calorieLabel.setText("Today's Calories: " + calories);
            } catch (Exception e) {

            }
        }
    }
}
