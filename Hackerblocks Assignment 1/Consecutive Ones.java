import java.util.*;
public class Main {



    public static int consecutive1(int[] arr)
    {
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                if(max<count){

                    max=count;
                }
            }
            else{
                count=0;
            }
        }
        //Write your code here
        return max;
    }




    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(consecutive1(arr));
    }

}
