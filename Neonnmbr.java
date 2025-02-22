import java.util.Scanner;
class  Neonnmbr
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int sqr = num*num;
		int sum = 0;
		while(sqr!=0){
			int rem = sqr%10;
			sum = sum+rem;
			sqr =sqr/10;
		}
		if(sum==num){
			System.out.println("Its neon num");
		}
		else{
			System.out.println("Its not neon");
		}


	}
}
