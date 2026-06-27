package day7.classtask;
import java.util.Arrays;
import java.util.Scanner;
public class markgrading {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int [] marks= new int[5];
        int sum=0;
        for(int i=0;i<marks.length;i++){
            System.out.println("Enter the marks :");
            marks[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(marks));
        for(int i=0;i<marks.length;i++){
            sum=sum+marks[i];
        }
        System.out.println("Total marks: "+sum);
    }
}
