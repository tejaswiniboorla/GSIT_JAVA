package day20;

public class Program02_ReverseStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="today is cold day";
		String[]words=str.split(" ");
		String output="";
		StringBuilder finalOutput=new StringBuilder();
		for(String word:words)
		{
			StringBuilder sb=new StringBuilder(word);
			finalOutput.append(sb.reverse()).append(" ");
			
		}
		output=finalOutput.toString().trim();
		System.out.println(output);
		
	}

}
