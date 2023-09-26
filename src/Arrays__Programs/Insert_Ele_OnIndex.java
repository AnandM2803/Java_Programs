package Arrays__Programs;

public class Insert_Ele_OnIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
int[] arr= {1,2,3,4,5};
int[] brr=new int[arr.length+1];
int ele=10;
int index=3;
int y=0;
for (int i = 0; i < brr.length; i++) {
	if(i==index)
	{
		brr[i]=ele;
	}
	else
	{
		brr[i]=arr[y];
		y++;
	}
}
for (int j = 0; j < brr.length; j++) {
	System.out.println(brr[j]);
	}
	}

}
