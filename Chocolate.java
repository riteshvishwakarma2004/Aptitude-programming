

public class Chocolate {

    public static void method1(int [] arr1 , int n){

        for(int i=0; i< arr1.length; i++){
            if(arr1[i] == 0){
                n--;
                method2(arr1, i,arr1[i]);
                i--;
                if(n==0){
                    return;
                }
            }
        }
    }

    public static void method2(int [] arr2, int i, int x ){
        int j;
        for( j=i; j<arr2.length - 1; j++){
            arr2[j] = arr2[j+1];
        }
        arr2[j] = 0;
    }

    public static void main(String [] args){
        int s = (int)System.currentTimeMillis();
        int [] arr = {4,5,0,1,9,0,5,0,5,8,7,4,1,0,2,5,6,5,4,1,2,5,4,8,7,9,5,4,1,2,5,6,3,2,5,4,2,0,0,0,0,2,5,4,0,2,5};
        int total = 0;
        for(int n :arr){
            if(n == 0){
                total++;
            }
        }
        method1(arr,total);

        for(int n: arr){
            System.out.print(n+ " ");
        }
        int t = (int)System.currentTimeMillis();
        System.out.println();
        System.out.println("time: "  + (t-s) + "ms");
    }
}
