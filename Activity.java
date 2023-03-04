import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Activity extends JFrame implements ActionListener {
    public static JSlider activitySlider;
    public Activity(String name) {
        super(name);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 140));
        panel.setBackground(new Color(230, 230, 230));
        panel.setLayout(null);

        activitySlider = new JSlider(0, 4, GlobalData.activity);
        activitySlider.setMajorTickSpacing(1);
        activitySlider.setPaintTrack(false);
        activitySlider.setPaintTicks(true);
        activitySlider.setPaintLabels(true);
        activitySlider.setSize(280, 50);
        activitySlider.setLocation(10, 10);
        panel.add(activitySlider);

        JLabel leastActive = new JLabel("Least active");
        leastActive.setFont(MainApp.menuFont);
        leastActive.setSize(100, 25);
        leastActive.setLocation(10, 70);
        panel.add(leastActive);

        JLabel mostActive = new JLabel("Most active");
        mostActive.setFont(MainApp.menuFont);
        mostActive.setSize(100, 25);
        mostActive.setLocation(225, 70);
        panel.add(mostActive);

        JButton applyButton = new JButton("Apply");
        applyButton.setFont(MainApp.menuFont);
        applyButton.setSize(280, 30);
        applyButton.setLocation(10, 100);
        applyButton.addActionListener(this);
        panel.add(applyButton);

        add(panel);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Apply":
                GlobalData.activity = activitySlider.getValue();
                GlobalData.writeUserData();
                break;
        }
    }
}
