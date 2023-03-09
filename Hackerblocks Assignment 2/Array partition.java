import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner scn=new Scanner(System.in);
        int n = scn.nextInt(); 
         int[] arr=new int[n];
           for (int i = 0; i < n; i++) 
            arr[i]=scn.nextInt();
            System.out.print(arrayPairSum(arr)); 
    }
    public static int arrayPairSum(int[] nums) {
        // Write your code here
    Arrays.sort(nums);
    int result = 0;
    for(int i = 0; i < nums.length; i += 2){
        result += nums[i];
    }
    return result;
    }
}
