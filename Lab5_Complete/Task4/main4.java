import librarylab.*;

public class main4 {
    public static void main(String[] args) {

        BookCopy[] book = new BookCopy[2];
        book[0] = new BookCopy("B-204", "Clean Code", "diana", true, new int[] { 7, 10, 13 });
        book[1] = new BookCopy("B-205", "Effective Java", "harry", true, new int[] { 5, 7, 9 });
        BookCopy cleanCode = book[0];

        if (cleanCode == book[0]) {
            System.out.println("both are equal");
        }

        cleanCode.calculateAverageLoanDays();
        book[1].calculateAverageLoanDays();

        for (int i = 0; i < 2; i++) {
            book[i].displayBook();
        }

        cleanCode.issueBook();
        cleanCode.issueBook();
        cleanCode.returnBook();
        System.out.println("Book objects created : " + BookCopy.bookCount);
        ReadingRoom room1 = new ReadingRoom("R-1", 1);
        room1.occupySeat();
        room1.displayRoom();
        room1.occupySeat();
    }

}
