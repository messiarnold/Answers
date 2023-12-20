import java.util.Random;
import java.util.Scanner;

public class game {
    public static void start_game() {
        String[] arr = {"rock", "paper", "scissors"};
        int player = 0;
        int computer = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            int computer_choice = new Random().nextInt(arr.length);
            System.out.println("-----------------------------------------\n");
            System.out.println("Choose: \"rock\", \"paper\", \"scissors\": ");
            String player_choice = scanner.nextLine();
            System.out.println("\n-----------------------------------------");

            System.out.println("- computer choice: " + arr[computer_choice]);
            System.out.println("- player choice: " + player_choice + "\n");


            if (player_choice.equals("rock")) {
                if (arr[computer_choice].equals("paper")) {
                    System.out.println("you lost\n");
                    computer++;
                } else if (arr[computer_choice].equals("scissors")) {
                    System.out.println("you won!! :)\n");
                    player++;
                } else if (arr[computer_choice].equals("rock")) {
                    System.out.println("tie\n");
                }
            }

            else if (player_choice.equals("paper")) {
                if (arr[computer_choice].equals("scissors")) {
                    System.out.println("you lost\n");
                    computer++;
                } else if (arr[computer_choice].equals("rock")) {
                    System.out.println("you won!! :)\n");
                    player++;
                } else if (arr[computer_choice].equals("paper")) {
                    System.out.println("tie\n");
                }
            }

            else if (player_choice.equals("scissors")) {
                if (arr[computer_choice].equals("paper")) {
                    System.out.println("you won!! :)\n");
                    player++;
                } else if (arr[computer_choice].equals("rock")) {
                    System.out.println("you lost\n");
                    computer++;
                } else if (arr[computer_choice].equals("scissors")) {
                    System.out.println("tie\n");
                }
            }

            System.out.println("- wins: " + player);
            System.out.println("- loses: " + computer);

            if ((player - computer) >= 2 && player > 2){
                System.out.println("\n-----------------------------------------");
                System.out.println("player won!!");
                break;
            }
            else if ((computer - player) >= 2 && computer > 2){
                System.out.println("\n-----------------------------------------");
                System.out.println("player lost ");
                break;
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            start_game();
            System.out.println("\n-----------------------------------------");
            System.out.println("to start a new game type yes: ");
            String choice = scanner.nextLine();
            if (choice.equals("yes")){}
            else {
            break;
            }
        }
    }
}



