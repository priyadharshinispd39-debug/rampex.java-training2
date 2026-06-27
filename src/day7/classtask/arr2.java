import java.util.Arrays;

public class arr2 {
    public static void main(String[] args) {
            int[] arr = new int [5];

            for(int i=0;i<=4;i++){
                arr[i]=(2*i)-1;
            }
            System.out.println(Arrays.toString(arr));
    }
}
