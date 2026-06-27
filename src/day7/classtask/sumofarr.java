package day7.classtask;

public class sumofarr {
    public static void main(String[] args){
        int arr[] ={1,2,3,4,5};
        int sum=0;
        for (int i=0;i<=4;i++){
            sum=arr[i]+sum;
        }
        System.out.println("sum:"+sum);
    }
}
