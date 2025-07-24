// StudentThread class extends Thread to allow each student to run in a separate thread
 public class StudentThread extends Thread
{
    // Name of the student attempting the exam
    private final String studentname;

    // Shared ServerDemo instance that handles synchronized exam submissions
    private final ServerDemo server;

    // Constructor to initialize student name and the shared server
    public StudentThread(String studentname,ServerDemo server)
    {
        this.studentname=studentname;
        this.server=server;
    }
    // This method runs when the thread starts.
    // It simulates the student submitting the exam via the server.
    public void run()
    {
        // Call the synchronized method of ServerDemo to submit the exam
        server.submitexam(studentname);
    }

}
