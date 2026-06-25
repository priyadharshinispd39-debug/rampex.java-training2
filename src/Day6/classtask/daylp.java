package Day6.classtask;

public class daylp {
    public static void main(String[] args){
        int count=0;
        for(int month=1;month<=12;month++){
            for(int week=1;week<=4;week++){
                for(int day=1;day<=7;day++){
                    if(day==1){
                       System.out.println("month :"+month+" week :"+week+" day :"+day);
                       System.out.println("sunday holiday");
                        count=day+count;
                    }

                }
            }
        }
        System.out.println("total days :" + count);
    }
}
