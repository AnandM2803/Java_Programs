package Arrays__Programs;

public class Insert_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,3,4,5};
int[] brr=new int[arr.length+1];
int ele=10;
for (int i = 0; i < brr.length; i++) {
	if(i==arr.length)
	{
		brr[i]=ele;
	}
	else
	{
		brr[i]=arr[i];
	}
}
for (int j = 0; j < brr.length; j++) {
	System.out.println(brr[j]);
	}
	}
}
