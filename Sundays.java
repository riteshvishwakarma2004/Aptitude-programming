import java.util.HashMap;
import java.util.Scanner;

public class Sundays {

    public static void countSundays(String start, int days){
        int dayNum =  dayToNum(start);
         int sundays = 0;
         int first = 6-dayNum;
         if(days<first){
             System.out.println("no sundays");
             return;
         }
         sundays++;
         int remain = days-first;
         sundays += (remain/7);
        System.out.println("total sundays: "+sundays);


    }
    public static int dayToNum(String day){
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("monday" , 0);
        hm.put("tuesday",1);
        hm.put("wednesday",2);
        hm.put("thursday",3);
        hm.put("friday",4);
        hm.put("saturday",5);
        hm.put("sunday",6);

        return hm.get(day);
    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the start day of the month: ");
        String start = sc.next().toLowerCase();
        System.out.println("enter the number of days: ");
        sc.nextLine(); // to consume the remained \n
        int days = sc.nextInt();

        countSundays(start, days);
    }
}
