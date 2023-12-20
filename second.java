import java.util.Scanner;

class HelloWorld2 {
    public static void main(String[] args) {
        int i; //מונה
        for(i=0;i<100;i = i + 3){
        }
        int n = -1;//מונה
        int current = 0;//דגל
        int sum = 0;//סוכם
        Scanner scanner = new Scanner(System.in);
        while(current != -1){
            System.out.println("Enter a number: ");
            current = scanner.nextInt();
            if (current >=0 ){
                sum = sum + current;
            }
            n++;
        }
        System.out.println(sum / n);

        int z = 0;
        int negative = 0;
        int[] arr = new int[10];
        while (z < 10) {
            System.out.println("Enter a number: ");
            arr[z] = scanner.nextInt();
            if (arr[z] < 0){
                negative++;
            }
            z = z + 1;
        }
        System.out.println("negative: " + negative);

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        for (int count : arr2){
            System.out.println(count);
        }

        int arr_1_counter = 0;
        int arr_2_counter = 0;
        for (int counter = 0; counter < 10;counter++){
            if (arr[counter] > 10 && arr[counter] <100){
                arr_1_counter++;
            }
            if (arr2[counter] > 10 && arr2[counter] <100){
                arr_2_counter++;
            }
        }
        int lengh = 10;
        int y = 0;
        int zeros = 0;
        while (y < lengh) {
            if (arr2[y] > 0){
                arr2[y] = arr2[y] * 2;
            }
            else if (arr2[y] < 0){
                arr2[y] = 0;
                zeros++;
            }
        }
        if (zeros > 0){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}