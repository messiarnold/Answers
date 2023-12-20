import java.util.Scanner;
public class loops_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int highest = 0;
        int sum = 0;
        for (int i = 0;i < 10;i++){
            System.out.println("Enter a number: ");
            arr[i] = scanner.nextInt();
            if (arr[i] > highest){
                highest = arr[i];
                sum = sum + arr[i];
            }
        }
        System.out.println("avg: " + (sum / 10) + " highest: " + highest);
    }
}
