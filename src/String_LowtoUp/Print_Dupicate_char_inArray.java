package String_LowtoUp;



public class Print_Dupicate_char_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,20,30,10,50,30};
for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]==arr[j])
			System.out.println(arr[j]);
	}
}
	}

}
