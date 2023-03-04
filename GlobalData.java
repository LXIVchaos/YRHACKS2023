import java.util.Scanner;
import java.io.*;

public class GlobalData {
    public static int currentWeight;
    public static int targetWeight;
    public static int workoutTime;
    public static int experience;
    public static int activity;
    public static boolean[] generalGoals = new boolean[3];
    public static boolean[] equipment = new boolean[5];
    public static boolean[] workoutDays = new boolean[7];


    //main user data reading method
    public static void readUserData() {
        try {
            Scanner s = new Scanner(new File("UserData.txt"));
            currentWeight = s.nextInt();
            targetWeight = s.nextInt();
            workoutTime = s.nextInt();
            experience = s.nextInt();
            activity = s.nextInt();
            
            for (int i = 0; i < 3; i++) {
                generalGoals[i] = s.nextInt() == 1;
            }

            for (int i = 0; i < 5; i++) {
                equipment[i] = s.nextInt() == 1;
            }

            for (int i = 0; i < 7; i++) {
                workoutDays[i] = s.nextInt() == 1;
            }
            s.close();
        } catch (Exception e) {
            System.out.printf("ERROR READING USER DATA: %s\n", e.getMessage());
        }
    }

    //when data gets updated
    public static void writeUserData() {
        try {
            PrintWriter w = new PrintWriter(new FileWriter("UserData.txt"));
            w.printf("%d %d %d %d %d\n", currentWeight, targetWeight, workoutTime, experience, activity);
            
            for (boolean i: generalGoals) {
                if (i) {
                    w.print("1 ");
                } else {
                    w.print("0 ");
                }
            }
            w.println();

            for (boolean i: equipment) {
                if (i) {
                    w.print("1 ");
                } else {
                    w.print("0 ");
                }
            }
            w.println();

            for (boolean i: workoutDays) {
                if (i) {
                    w.print("1 ");
                } else {
                    w.print("0 ");
                }
            }

            w.close();
        } catch (Exception e) {
            System.out.printf("ERROR SAVING USER DATA: %s\n", e.getMessage());
        }
    }
}
