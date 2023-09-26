package Arrays__Programs;

import java.util.Arrays;

public class StringReplace_bufferbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I am Java";
		str=str.replaceAll(" ", "@40");
		StringBuilder ans=new StringBuilder();
		ans.append(str);
		System.out.println(ans);
	}
}
