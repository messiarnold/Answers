import java.util.Scanner;

public class matala_3 {
    public static void fill(int arr[]){
        int temp = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i < 20;i++){
            System.out.println("Enter a num between 100 and 200: ");
            temp = scanner.nextInt();
            while (temp < 100 || temp > 200) {
                System.out.println("Enter again: ");
                temp = scanner.nextInt();  
            }
            arr[i] = temp;
        }
    } 
    public static void bigger_than_20(int arr[]){
        for (int i : arr){
            if (i > 20){
                System.out.println(i);
            }
        }
    }
    public static int average(int arr[]){
        int counter = 0;
        int sum = 0;
        for (int i : arr){
            sum += i;
            counter ++;
        }
        return (sum / counter);
    }
    public static int negetive(int arr[]){
        int counter = 0;
        for (int i : arr){
            if (i < 0){
                counter++;
            }
        }
        return counter;
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPeak(int arr[], int index) {
        if (index == 0) {
            return arr[index] > arr[index + 1];
        }
    
        if (index == arr.length - 1) {
            return arr[index] > arr[index - 1];
        }
    
        return arr[index] >= arr[index - 1] && arr[index] >= arr[index + 1];
    }
    public static boolean hasRequiredPeaks(int arr[], int requiredCount) {
        int peakCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPeak(arr, i)) {
                peakCount++;
            }
        }
        return peakCount >= requiredCount;
    }
    public static boolean isFibonacci(int number) {
        int a = 0;
        int b = 1;

        while (b <= 200) {
            if (number == b) {
                return true;
            }

            int next = a + b;
            a = b;
            b = next;
        }

        return false;
    }
    public static int countFibonacciNumbers(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (isFibonacci(num)) {
                count++;
            }
        }

        return count;
    }
    public static void check(int arr[],int minimum_average,int maximum_negative,int num_of_prime_numbers,int maximum_fibonacci,int minimum_peak){
        int temp = average(arr);
        int Prime_counter = 0;
        for (int i : arr){
            if (isPrime(i)){
                Prime_counter++;
            }
        }
        int peak_Counter = 0;
        int index = 0;
        for (int i : arr){
            if (isPeak(arr, index)){
                peak_Counter++;
            }
            index++;
        }
        if (temp >= minimum_average && negetive(arr) < maximum_negative && Prime_counter == num_of_prime_numbers && countFibonacciNumbers(arr) < maximum_fibonacci && peak_Counter > minimum_peak){
            for (int i : arr){
                System.out.println(i);
            }
            System.out.println("minimum_average\nmaximum_negative\nnum_of_prime_numbers\nmaximum_fibonacci\nminimum_peak");
        }
        else{
            System.out.println("the arr isn't doing everything right");
            if (temp < minimum_average) {
                System.out.println("minimum_average");
            }
            if (negetive(arr) > maximum_negative) {
                System.out.println("maximum_negative");
            }
            if (Prime_counter != num_of_prime_numbers) {
                System.out.println("num_of_prime_numbers");
            }
            if (countFibonacciNumbers(arr) > maximum_fibonacci) {
                System.out.println("maximum_fibonacci");
            }
            if (peak_Counter < minimum_peak) {
                System.out.println("minimum_peak");
            }
        }

    }
    public static void main(String[] args){
        int[] arr = new int[20];
        fill(arr);
        int minimum_average;
        int maximum_negative;
        int num_of_prime_numbers;
        int maximum_fibonacci;
        int minimum_peak;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a minimum_average");
        minimum_average = scanner.nextInt();
        System.out.println("Enter a maximum_negative");
        maximum_negative = scanner.nextInt();
        System.out.println("Enter a num_of_prime_numbers");
        num_of_prime_numbers = scanner.nextInt();
        System.out.println("Enter a maximum_fibonacci");
        maximum_fibonacci = scanner.nextInt();
        System.out.println("Enter a minimum_peak");
        minimum_peak = scanner.nextInt();
        check(arr, minimum_average, maximum_negative, num_of_prime_numbers, maximum_fibonacci, minimum_peak);
    }
}
