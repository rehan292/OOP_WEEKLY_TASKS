package librarylab;

public class ReadingRoom {
    private final String roomID;
    private int capacity;
    private int occupied;

    public ReadingRoom(String roomID, int capacity) {
        this.roomID = roomID;
        this.capacity = capacity;
        occupied = 0;

    }

    public void occupySeat() {
        if (occupied == capacity) {
            System.out.println("Rooom is full");
            return;
        }
        occupied++;
    }

    public void freeSeat() {
        if (occupied == 0) {
            System.out.println("seats are already freed");
            return;
        }
        occupied--;
    }

    public void displayRoom() {
        System.out.println(roomID + " | Occupied : " + capacity + "/" + occupied);
    }
}