import java.util.Scanner;

public class loops_5 {
    public static int Sum_Of_Digits(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args){
        int current = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i < 10;i++){
            System.out.println("Enter a num between 100 to 5: ");
            current = scanner.nextInt();
            while (current < 5 || current > 100){
                System.out.println("Enter again: ");
                current = scanner.nextInt();
            }
            System.out.println("sum of digits = " + Sum_Of_Digits(current));
        }
    }
}
