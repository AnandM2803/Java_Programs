package com.programming;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="Hey Hey I I am Ram Ram";
       s=s.toLowerCase();
String[] str=s.split(" ");
int count;
for(int i=0;i<str.length;i++)
{
	count=1;
	for(int j=i+1;j<str.length;j++)
	{
		if(str[i].equals(str[j]))
		{
			count++;
			str[j]="0";
		}
	}
	if(count>1 && str[i]!="0")
	{
		System.out.print(str[i]+" ");
	}
}
	}

}
