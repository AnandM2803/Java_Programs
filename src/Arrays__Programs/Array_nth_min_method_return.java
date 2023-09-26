package Arrays__Programs;

import java.util.Arrays;

public class Array_nth_min_method_return {
	private static int sum(int[] arr)
	{
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		return arr[0]+arr[1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,5,7,9,25,100};
		System.out.println(sum(arr));
	}

}
