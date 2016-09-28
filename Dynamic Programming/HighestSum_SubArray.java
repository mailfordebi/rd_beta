/**
 * Write an efficient Java program to find the sum of contiguous subarray within
 * a one-dimensional array of numbers which has the largest sum.
 * 
 * @author DEBI 
 * Kadane’s Algorithm:
 */

public class HighestSum_SubArray {
	public int getHignhestSumSubArray(int arr[]) {
		int max_val = 0;
		int max_i = 0;
		int start_index=0;
		int end_index=0;
		for (int i = 0; i < arr.length; i++) {
			max_i = max_i + arr[i];
			if (max_i < 0) {
				max_i = 0;
			}
			if (max_i > max_val) {
				max_val = max_i;
				end_index=i;
			}
		}
		
		int k=end_index;
		for(int j=max_val;j!=0;){
			j=j-arr[k];
			k--;
		}
		start_index=++k;
		System.out.println("Elements of largest sum ");
		for(int i=start_index;i<=end_index;i++){
			System.out.print(arr[i] +" ");
		}
		
		System.out.println();
		return max_val;
	}

	public static void main(String[] args) {
		int a[] = { 4, -1, 2, -5, 4, 3 };
		int max_sum = new HighestSum_SubArray().getHignhestSumSubArray(a);
		System.out.println(max_sum);
	}
}
