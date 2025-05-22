import java.util.Scanner;

public class GreaterElements {
    public static void countGreaters(int n, int [] arr){
        int large = arr[0];
        int count = 1;
        for(int i=1; i<n; i++){
            if(arr[i]>large){
                count++;
                large = arr[i];
            }
        }
        System.out.print("the array is: ");
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("total large elements are: "+count);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter the "+(i+1)+"th element: ");
            arr[i] = sc.nextInt();
        }

        countGreaters(n, arr);
    }
}
