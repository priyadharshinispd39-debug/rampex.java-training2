package day7.classtask;

public class findMAXmin {
    public static void main(String[] args){
        int max=0;
        int [] arr= {3,4,5,2,0};

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum number in array : "+max);
    }
}
