package Arrays__Programs;

import java.util.Arrays;

public class Array_Sum_Two_Ele {
public static void main(String[] args) {
	int[] arr= {10,20,5,7,9,25,100};
	Arrays.sort(arr);
	System.out.println(arr[arr.length-1]+arr[arr.length-2]);
}
}
