package day7.classtask;

public class findMAXmin {
    public static void main(String[] args){
        int [] arr= {3,4,5,2,1};
        int min=arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("minimum number in array : "+min);

    }
}
