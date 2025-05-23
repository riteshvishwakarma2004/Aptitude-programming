import java.util.Scanner;

public class SumUptoSingle {

    public static void convertToSingle(int n, int r){
        int sum=0;
        for(int i=0; i<r; i++){
            int num = n;
            while(num>0){
                sum = sum + num%10;
                System.out.println("current sum is: "+sum);
                num = num/10;
            }
        }
        System.out.println("total sum is: "+sum);
        if(sum < 10){
            System.out.println(sum);
            return;
        }
        int temp = 0;

        while(true) {

            do {
                temp = temp + (sum % 10);
                sum = sum / 10;
                System.out.println("current temp is: "+temp);
            } while (sum > 0);
            if(temp <10){
                System.out.println("final answer: "+temp);
                break;
            }
            sum = temp;
            temp = 0;
            System.out.println("new sum is: "+sum);
        }

    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N: ");
        int n = sc.nextInt();
        System.out.println("Enter the number to time to repeat (R): ");
        int r = sc.nextInt();

        convertToSingle(n,r);
    }
}
