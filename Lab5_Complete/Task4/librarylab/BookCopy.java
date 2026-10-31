package librarylab;

public class BookCopy {
    private final String copyID;
    private String title;
    private String author;
    private boolean availability;
    private int[] LoanDays = new int[3];
    private double averageLoanDays;
    public static int bookCount = 0;

    public BookCopy(String copyID, String title, String author, boolean availability, int[] LoanDays) {
        this.copyID = copyID;
        this.title = title;
        this.author = author;
        this.availability = availability;
        this.LoanDays = LoanDays;
        averageLoanDays = 0;
        bookCount++;

    }

    public void issueBook() {
        if (availability) {
            System.out.println("Book issued " + copyID);
            availability = false;
        } else {
            System.out.println("cannot issue book is unavailable ");
        }
    }

    public void returnBook() {
        System.out.println("Book returned : " + copyID);
        availability = true;

    }

    public void updateLoanDays(int index, int days) {
        for (int i = 0; i < 3; i++) {
            LoanDays[index] = days;
        }

    }

    public void calculateAverageLoanDays() {
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + LoanDays[i];
        }
        avg = sum / (LoanDays.length);
        averageLoanDays = avg;
    }

    public void displayBook() {
        System.out.println(
                copyID + " | " + title + " | Available : " + availability + " | average loan : " + averageLoanDays);
    }

}