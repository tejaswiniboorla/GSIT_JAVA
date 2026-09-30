package day19;

public class Program02_NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i am happy today";
		int sp=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==' ')
				sp++;
		}
		System.out.println(sp+1);	
		String[]words=str.split(" ");
		System.out.println(words.length);

	}

}
