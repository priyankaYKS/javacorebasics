import java.util.Scanner;

public class Addition
{
	static Scanner sc=new Scanner(System.in);
	public void findAddition(int arr[],int input4)
	{
		int i=0;
		int sum=0;
		if(input4==0) 
		{
			for(i=0;i<arr.length;i++) 
			{
			int r=arr[i]%10;
			sum+= r;
			
			}
		}
		else if(input4==1) 
		{
			for(i=0;i<arr.length;i++) 
			{
				if(arr[i]<10)
				{
					sum+=1;
				}
				else {
					int r=(arr[i]/10)%10;
				}
			}
		}
				else {
					for(i=0;i<arr.length;i++) {
						if(arr[i]<100) {
							sum+=2;
						}else {

					int r=(arr[i]/100)%10;
					sum+=r;
				}
				
			}
				}
		
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
	Addition add=new Addition();
	int input1=sc.nextInt();
	int input2=sc.nextInt();
	int input3=sc.nextInt();
	int input4=sc.nextInt();
	int arr[]= {input1,input2,input3};
	add.findAddition(arr, input4);
}
}
