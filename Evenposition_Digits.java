import java.util.Scanner;
class  Evenposition_Digits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nmbr");
		int num = sc.nextInt();
		int n =num;
		int count =0;

		while (n!=0)
		{
			n=n/10;
			count++;
		}

		while (num!=0) 
		{
			
			int rem = num%10;
			
			if(count%2==0){
				System.out.println("Even position digit"+rem);
				
			}

			count--;
			num=num/10;
			
			
		}
	}
}
