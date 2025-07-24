import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Shared ServerDemo instance - will be accessed by all threads
        ServerDemo server = new ServerDemo();

// List to store all entered student names
        List<String> studentNames = new ArrayList<>();
        System.out.println("Enter student names (type 'end' to finish):");

        // Take input from user until 'end' is typed
        while (true) {
            System.out.print("(TYPE END TO FINISH) \n" +"OR\n"+
                    "enter Student name  \n");
            String name = in.nextLine().trim();

            if (name.equalsIgnoreCase("end"))
                break;

            // Add student name to the list
            studentNames.add(name);
        }

        // Create and start a separate thread for each student
        List<Thread> threadList = new ArrayList<>();
        for (String name : studentNames)
        {
            // Create a thread for each student using StudentThread class
            StudentThread t = new StudentThread(name, server);
            threadList.add(t);
            t.start();
        }

        // Wait for all student threads to complete using join()
        for (Thread t : threadList) {
            try {
                t.join();
            } catch (InterruptedException e) {
                System.out.println("Join interrupted");
            }
        }

// After all threads complete, print submission records
        server.printallsubmissions();
    }
}
