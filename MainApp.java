import java.awt.*;
import javax.swing.*;

public class MainApp
{
    //global trakcer for windows
    public static MainWindow mainWindow;
    public static GoalWindow goalWindow;
    public static Font menuFont = new Font("Segoe UI", Font.PLAIN, 12);

    public static void main(String[] args) {
        //set up all the windows
        mainWindow = new MainWindow("SimpliFit");
        goalWindow = new GoalWindow("Goals");
        mainWindow.setVisible(true);
    }
}