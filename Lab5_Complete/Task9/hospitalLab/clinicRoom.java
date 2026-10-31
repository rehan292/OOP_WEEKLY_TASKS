package hospitalLab;

public class clinicRoom {
    private final String roomNo;
    private int capacity;
    private int occupied;

    public clinicRoom(String roomNo, int capacity) {
        this.roomNo = roomNo;
        this.capacity = capacity;
    }

    public void checkInvisitor() {
        if (capacity > occupied) {
            occupied++;

        } else {
            System.out.println("seats are fulled ");
        }

    }

    public void displayroom() {
        System.out.println(roomNo + " | occupied : " + occupied + "/" + capacity);
    }

}
