public class loops_1 {
    public static void print(float arr[]){
        for (float i : arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        float[] arr = {1,2,3,4,5,6};
        System.out.println(arr[3]);
        if (arr[4] >= arr[5]){
            arr[2] = arr[4];
        }
        else { 
            arr[2] = arr[5];
        }
        print(arr);
    }
    
}
