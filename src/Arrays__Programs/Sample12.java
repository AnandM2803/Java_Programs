package Arrays__Programs;

public class Sample12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] arr= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
	{
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}
System.out.println();
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
	{
		System.out.print(arr[i][j]+" ");
	}
	break;
}
	}

}