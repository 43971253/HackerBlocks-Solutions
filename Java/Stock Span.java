import java.util.*;
public class StockSpan {
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while (t > 0) {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
		arr[i] = scn.nextInt();
		int S[] = new int[n];
		calculateSpan(arr , S);
		printArray(S);
		t--;
      
    }
    
  }
  static void calculateSpan(int[] arr, int[] S)
  {
    S[0] = 1;
    for (int i = 1; i < arr.length; i++) {
      S[i] = 1;
      for (int j = i - 1;
      (j >= 0) && (arr[i] >= arr[j]); j--)
      S[i]++;
      
    }
    
  }
  static void printArray(int[] ar)
  {
     
    System.out.println(Arrays.toString(ar).replace("[","").replace("]","").replace(",",""));
    
     
    
  }
  
}


