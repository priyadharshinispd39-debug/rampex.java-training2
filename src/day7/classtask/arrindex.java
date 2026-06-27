package day7.classtask;
import java.util.Scanner;
import java.util.Arrays;
public class arrindex {
    public static void main(String[] args){
        int arr[]=new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<=4;i++){
            System.out.println("enter the position :"+ (i+1));
            arr[i]=sc.nextInt();


        }
        System.out.println(Arrays.toString(arr));
    }
}
