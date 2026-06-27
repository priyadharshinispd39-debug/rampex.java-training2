package day7.classtask;
import java.util.Arrays;
public class productarr {
    public static void main(String[] args){
        int arr[]= {1,2,3,4,5};
        int product=1;

        for(int i=0;i<=4;i++){
                product=product*arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("product of array: "+product);

    }
}
