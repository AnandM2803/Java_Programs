package String_LowtoUp;

public class Str_plaindrome_Array_without_forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str[] = {"MADAM"};
int i=0;
int j=str.length-1;
int n=str.length;
boolean flag=true;
while(i<=n/2)
{
	if(str.length!=str.length)
	{
		flag=false;
		break;
	}
	i++;
	j--;
}
if(flag)
	System.out.println("Is a plaindrome");
else
	System.out.println("IS not a plaindrome");
	}

}
