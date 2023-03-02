import java.util.*;
public class Main {


    public static int[] sortedSquares(int[] nums) {
        
        int[] res = new int[nums.length];
        int s = 0;
        int i = 0;
        int j = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] < 0) {
                j++;
            }
            nums[k] = nums[k] * nums[k];
        }
        i = j -1;
        while (i >= 0 && j <= nums.length - 1) {
            if (nums[i] < nums[j]) {
                res[s] = nums[i];
                i--;
            } else {
                res[s] = nums[j];
                j++;
            }
            s++;
        }
        while (i >= 0) {
            res[s] = nums[i];
            i--;
            s++;
        }
        while (j <= nums.length - 1) {
            res[s] = nums[j];
            j++;
            s++;
        }
        return res;
    }




    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        arr = sortedSquares(arr);
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
