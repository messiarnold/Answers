public class loops_2 {
    public static void change(int arr[]){
        arr[0] = 100;
    }
    public static void main(String[] args){
        int[] arr = new int[10];
        for (int i = 0;i < 10;i++){
            arr[i] = i * 3;
        }
        change(arr);
        for (int i : arr){
            if ((i % 2) == 0){
                System.out.print("double: ");
            }
            else {
                System.out.print("odd: ");
            }
            System.out.println(i);
        }
    }
}
