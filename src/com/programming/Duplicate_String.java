package com.programming;

public class Duplicate_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="sunitha shree";
String[] ch=str.split("");
for(int i=0;i<ch.length;i++)
{
for(int j=i+1;j<ch.length;j++)
{
	if(ch[i].equals(ch[j]))
	{
	
	System.out.print(ch[i]);
	}
	
}
	}
//System.out.p

}
}
