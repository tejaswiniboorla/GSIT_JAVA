package day22;
import java.util.*;
public class Program01_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="[[[[]]]]]";
		int flag=0;
		Stack<Character>st=new Stack<Character>();
		char[]alpha=str.toCharArray();
		for(char ch:alpha)
		{
			if(ch=='[')
				st.push(ch);
			else
			{
				if(st.isEmpty())
				{
					flag=1;
					System.out.println("Unbalanced");
					break;
				}
				else
				{
					st.pop();
				}
			}
			
		}
		if(st.isEmpty())
		{
			if(flag==0)
				System.out.println("Balanced");
		}
		else
		{
			System.out.println("Unbalanced");
		}
	}

}
