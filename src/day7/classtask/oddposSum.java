package day7.classtask;
import java.util.Arrays;
public class oddposSum {
    public static void main(String[] args){
        int arr[]= {1,2,3,4,5};
        int sum=0;
        for(int i=0;i<=4;i++){
            if(i % 2 !=0){
                sum=sum+arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("sum of odd position:"+sum);

    }
}
