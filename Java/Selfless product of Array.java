import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner scn=new Scanner(System.in);
        int n = scn.nextInt(); 
         int[] arr=new int[n];
           for (int i = 0; i < n; i++) 
            arr[i]=scn.nextInt();
        int[] ans = productExceptSelf(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        } 
    }
    public static int[] productExceptSelf(int[] nums) {
        // Write your code here
        int product=1;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           res[i]=product;
           product*=nums[i];

           
        }
         product=1;
        for(int i=nums.length-1;i>=0;i--){
           res[i]=product*res[i];
           product*=nums[i];
        }
        return res;
    }


}
