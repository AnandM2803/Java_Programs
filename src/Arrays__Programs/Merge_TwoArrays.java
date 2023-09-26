package Arrays__Programs;

public class Merge_TwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,3,0,0,0};
int[] brr= {4,5,6};
int[] res=new int[arr.length + brr.length];
for(int i=0;i<arr.length;i++)
{
	
	res[i]=arr[i];
}
for(int j=0;j<brr.length;j++)
{
	
	res[arr.length+j]=brr[j];
}
for(int k=0;k<res.length;k++)
{
	System.out.println(res[k]);
}
	}

}
