import java.util.Scanner;
public class loops_4 {
    public static void main(String[] args){
        int current = 0;
        int sum = 0;
        int counter = 0;
        int highest = 0;
        int smallest = 0;
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter a number: ");
            current = scanner.nextInt();

            if (current < 0){
                break;
            }

            if (current > highest){
                highest = current;
            }
            if (current < smallest){
                smallest = current;
            }

            sum += current;
            counter++;
            if (counter == 1){
                smallest = current;    
            }
        }

        System.out.println("highest = " + highest + " smallest = " + smallest + " numbers = " + counter + " average = " + (sum / counter));
    }
}
