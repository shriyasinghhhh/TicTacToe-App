import java.util.Scanner;

class TicTacToe {

    // Method to get user slot input
    static int getUserInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }

    public static void main(String[] args) {

        int userSlot = getUserInput();

        System.out.println("You selected slot: " + userSlot);
    }
}