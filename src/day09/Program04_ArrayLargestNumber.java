package day09;

public class Program04_ArrayLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []arr1= {10,2,3,-1,99,7,99};
		//int largest=arr1[0];
		
		 //for (int i=1;i<=arr1.length-1;i++)
		 {
			// if(arr1[i]>largest)
				// largest=arr1[i];
		 }
		
			//System.out.println(largest);
			//for(int i=0;i<=arr1.length-1;i++)
			{
				//if(arr1[i]==99)
				{	
					//System.out.println("Index of 99:"+i);
					//int[]arr2= {99,2,3,-1,99,7,99};
					//int largest1=arr2[0];
					//int secondLargest=Integer.MIN_VALUE;
					//System.out.println("Min Value:"+ secondLargest);
					//for(int j=1;j<=arr2.length-1;j++)
					{
						//if(arr2[j]>largest1)
							//largest1=arr2[j];
						
					}
					
					//for(int j=0;j<=arr2.length-1;j++)				{
						//if(arr2[j]>secondLargest && arr2[j]!=largest1)
							//secondLargest=arr2[j];
						
					}
					//System.out.println("SEC LARGEST:"+secondLargest);
				}
				int arr3[]= {40,18,20,20,15,3,39};
				int largestNum=Integer.MIN_VALUE;
				int secLargestNum=Integer.MIN_VALUE;
				for(int k=0;k<=arr3.length-1;k++)
				{
				if(arr3[k]>largestNum)
				{
					secLargestNum=largestNum;
					largestNum=arr3[k];
				}
				else if(arr3[k]>secLargestNum && arr3[k]!=largestNum)
					secLargestNum=arr3[k];
				}
				System.out.println("LargestNum:"+largestNum);
				System.out.println("SEC LargestNum:"+secLargestNum);
				
				
				}
			}
		 
	



 