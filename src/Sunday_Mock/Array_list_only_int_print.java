package Sunday_Mock;

import java.util.ArrayList;

public class Array_list_only_int_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a1=new ArrayList();
a1.add(10);
a1.add(20);
a1.add(20.5);
a1.add(true);
a1.add('J');
a1.add("Java");
a1.add(30);
a1.add(40);
for(int i=0; i<a1.size();i++)
{
	try {
		int a=(int)a1.get(i);
		System.out.println(a);
	}
	catch(Exception e)
	{
		continue;
	}
	}
	}

}
