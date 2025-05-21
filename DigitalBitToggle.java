import java.util.Scanner;

public class DigitalBitToggle {

    public static void method1(int num){
        String binary = convertToBinary(num);
        System.out.println("the binary form of number is: "+binary);
        String toggled = toggleBits(binary);
        System.out.println();
        System.out.println("the toggled binary form of number is: "+toggled);
        int current = 1;
        int newNum = 0;
        for(int i = toggled.length()-1; i>=0; i--){
            if(toggled.charAt(i) == '1'){
                newNum = newNum + current;
            }
            current *= 2;
        }
        System.out.println("new number is: "+ newNum);
    }
    public static String convertToBinary(int num){
        StringBuffer sb = new StringBuffer();
        while(num>0){
            int bit = (num%2);
            sb.insert(0,bit);
            num = num/2;
        }
        return sb.toString();
    }
    public static String toggleBits(String binary){
        StringBuffer sb = new StringBuffer(binary);
        for(int i=0; i<sb.length(); i++){
            System.out.print("the bit is: "+sb.charAt(i)+" ");
            if(sb.charAt(i) == '0'){
                sb.replace(i,i+1,"1");
                System.out.print("changed to "+ sb.charAt(i)+" ");
                continue;
            }else{
                sb.replace(i,i+1,"0");
                System.out.print(" 'else' changed to "+ sb.charAt(i)+" ");
            }
        }
        return sb.toString();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter the number: ");
        number = sc.nextInt();

        method1(number);
    }
}
