package Arrays__Programs;

public class Array_Odd_Even_merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {15,7,9,2,0,10};
int brr[]=new int[arr.length];
int y=0;
for(int i=0;i<arr.length;i++)
{
	for (int j = 0; j < arr.length-1; j++) {
		if(arr[j]>arr[j+1])
		{
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}	
	}
}
	for (int j = 0; j < arr.length; j++) {
		if(arr[j]%2==0)
			{brr[y]=arr[j];
		y++;}
	}
	for (int j = 0; j < arr.length; j++) {
		if(arr[j]%2!=0)
		{brr[y]=arr[j];
		y++;}
	}

for (int j = 0; j < brr.length; j++) {
	System.out.println(brr[j]);
}

	}

}
