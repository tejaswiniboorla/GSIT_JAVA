package seleniumday03;

public class Program01_Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nameList= {"Rajm", "Rajmohan", "Rajmu", "Rajmat", "Ra", "abcd"};
		String longest="";
		int flag=0;
		String current="";
		for(int i=0;i<=nameList[0].length()-1;i++)
		{
			current=current+nameList[0].charAt(i);
			for(int j=1;j<=nameList.length-1;j++)
			{
				if(nameList[j].startsWith(current))
				{
					
				}
				else
				{
					flag=1;
					break;
					
				}
			}
			if(flag==0)
			{
				longest=current;
				
			}
			if(flag==1)
				break;
		}

			if(longest.isEmpty())
				System.out.println("No prefix found");
			else
				System.out.println(longest);
	}

}
