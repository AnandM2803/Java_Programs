package Arrays__Programs;

import java.util.Arrays;

public class Array_Merge_Bufferreadr {

	static void array(int[] arr,int[] brr)
	{
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr[i]=brr[j];
				j++;
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,3,0,0,0};
int[] brr= {4,6,5};
array(arr,brr);
	}

}
