import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class MainApp
{
    //global trakcer for windows
    public static MainWindow mainWindow;
    public static GeneralGoals generalGoalWindow;
    public static TargetWeight targetWeightWindow;
    public static CurrentWeight currentWeightWindow;
    public static Experience experienceWindow;
    public static Equipment equipmentWindow;
    public static Schedule scheduleWindow;
    
    public static Font menuFont = new Font("Segoe UI", Font.PLAIN, 12);
    public static Font titleFont = new Font("Segoe UI", Font.BOLD, 20);

    public static void main(String[] args) {
        //set up all the windows
        GlobalData.readUserData();
        mainWindow = new MainWindow("SimpliFit");
        generalGoalWindow = new GeneralGoals("General Goals");
        targetWeightWindow = new TargetWeight("Target Weight");
        currentWeightWindow = new CurrentWeight("Current Weight");
        experienceWindow = new Experience("Experience");
        equipmentWindow = new Equipment("Equipment");
        scheduleWindow = new Schedule("Schedule");
        mainWindow.setVisible(true);
    }
}