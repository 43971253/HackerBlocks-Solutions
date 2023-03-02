import java.util.*;
public class Main {

    public static void nextPermutation(int[] nums) {
        //Write your code here
         int n=nums.length;
        int k=n-2;
        if(n==0 || nums==null) return;
        for(int i=n-1;i>0;i--){
            if(nums[i-1]>=nums[i]) k--;
            else break;
        }
        if(k==-1){
            reverse(nums,0,n-1);
return;
        }
       
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[k]){
                    int temp=nums[k];
                    nums[k]=nums[i];
                    nums[i]=temp;
                    break;
                }

            }
            reverse(nums,k+1,n-1);
    }
     public static void reverse(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;end--;
        }
}

    


    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        nextPermutation(arr);
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
