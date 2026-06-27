package day7.classtask;

public class secMAX {
    public static void main(String[] args){
        int [] arr= {3,4,5,2,1};
        int max=0;
        int secondmax=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }

        }
        System.out.println("maximum number in array : "+max);
        System.out.println("Second maximum number in array : "+secondmax);

    }
}
