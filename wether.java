import java.util.Scanner;

public class wether {
    public static void data(int jerusalem[],int tel_aviv[]){
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (i < 12) {
            System.out.println("Enter the average degrees for city 1 for month " + (i + 1) + ":");
            int temp = scanner.nextInt();
            while (temp > 40 || temp < 0){
                System.out.println("Enter the average degrees for city 1 for month " + (i + 1) + " again:");
                temp = scanner.nextInt();
            }
            tel_aviv[i] = temp;
            i++;
        }
        i = 0; 
        while (i < 12) {
            System.out.println("Enter the average degrees for city 2 for month " + (i + 1) + ":");
            int temp = scanner.nextInt();
            while (temp > 40 || temp < 0){
                System.out.println("Enter the average degrees for city 2 for month " + (i + 1) + " again:");
                temp = scanner.nextInt();
            }
            jerusalem[i] = temp;
            i++;
        }
    }
    public static int less(int jerusalem[],int tel_aviv[],int month){
        if (tel_aviv[month] < jerusalem[month]){
            return 1;
        }
        else{ 
            return 2;
        }
    }
    public static int more(int jerusalem[],int tel_aviv[],int month){
        if (tel_aviv[month] > jerusalem[month]){
            return 1;
        }
        else{ 
            return 2;
        }
    }
    public static float average(int arr[]){
        float sum = 0;
        for (int i : arr){
            sum = sum + i;
        }
        return (sum / 12);
    }
    public static int difference(int jerusalem[],int tel_aviv[]){
        int temp = 0;
        int current_highest = 0;
        for (int i = 0;i < 12;i++){
            if ((jerusalem[i] - tel_aviv[i]) > current_highest){
                current_highest = i;
            }
            else if ((tel_aviv[i] - jerusalem[i]) > current_highest){
                current_highest = i;
            }    
        }   
        return current_highest;  
    }

    public static void main(String[] args){
        //תל אביב - 1  
        //ירושלים - 2
        int[] cities = {1,2};
        int[] jerusalem = new int[12];
        int[] tel_aviv = new int[12];
        data(jerusalem, tel_aviv);

    }
}
