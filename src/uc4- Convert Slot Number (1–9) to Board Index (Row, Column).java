public class TicTacToe {

    public static void main(String[] args) {
        int slot = 7;

        System.out.println("Row: - uc4- Convert Slot Number (1–9) to Board Index (Row, Column).java:6" + getRowFromSlot(slot));
        System.out.println("Column: - uc4- Convert Slot Number (1–9) to Board Index (Row, Column).java:7" + getColFromSlot(slot));
    }

    // Convert slot to row index
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    // Convert slot to column index
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}