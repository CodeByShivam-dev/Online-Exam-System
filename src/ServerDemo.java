import java.util.*;

// This class represents the shared server system where students submit their exams
class ServerDemo
{

    // A shared list to keep track of submission records of all students
    // This list is shared across multiple threads, so to access it in a synchronized manner
    private final List<String>records=new ArrayList<>();
    ///**
    //     * This method allows a student to submit their exam.
    //     * It is synchronized to make sure only one student task can be done first while submitting the paper while others should be locked(i.e., one thread)
    //     * can access this method at a time.
    //     * This prevents race conditions and ensures consistent data in a multithreaded environment.
    //     */

    public synchronized void submitexam(String studentname)
    {

        // Use this to Print a line gap for cleaner output
        System.out.println("");

        // Inform that this student is currently submitting the exam
        System.out.println(studentname+" "+"is submitting the exam");

        try
        {
                // Simulating exam submission delay of 3 seconds
                // Just like uploading answers or submitting form takes time
            Thread.sleep(3000);
        } catch (InterruptedException e)
        {
            // If any thread interrupts during sleep, rethrow as runtime exception with message
            throw new RuntimeException("Thread interuppted while"+studentname+"was giving the exam",e);
        }
        // Once delay is over, submission is complete
        System.out.println(studentname+" "+"successfully submitted the exam");

        // Storing the records of students who have submitted the paper
        records.add(studentname+" "+"Submitted Successfully");

        // Print confirmation message
        System.out.println(studentname+" "+"submitted successfully");
    }
    /**
     * This method prints the list of all successful submissions.
     * Should be called after all threads have finished (i.e., all students submitted).
     */
    public void printallsubmissions()
    {
        System.out.println("\n-------ALL SUBMISSIONS RECORDS");
        for(String record:records)
        {
            System.out.println(record);
        }
}
}

