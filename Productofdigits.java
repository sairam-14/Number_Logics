import java.util.Scanner;
class Productofdigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numr");
		int num = sc.nextInt();
		int product=1;
		while(num!=0){

			int reminder = num%10;
			product = product*reminder;
		
			num =num/10;

		}
		System.out.println(product);
	}


	}
	
