import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        int slot = getUserSlot();
        System.out.println("Slot entered: - uc3.java:8" + slot);
    }

    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot number (19): - uc3.java:14");
        int slot = sc.nextInt();

        return slot;
    }
}