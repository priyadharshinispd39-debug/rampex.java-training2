package day7.classtask;
import java.util.Scanner;
import java.util.Arrays;
public class arrscan {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<=4;i++){
            System.out.println("Enter the number:");
            arr[i]=sc.nextInt();

        }
        System.out.print(Arrays.toString(arr));

    }
}
