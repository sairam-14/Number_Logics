import java.util.Scanner;
class Spynmbr 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nmbr");
		int num = sc.nextInt();
		int sum=0;
		int prod=1;
		while(num!=0){
			int rem = num%10;
			sum=sum+rem;
			prod=prod*rem;
			num=num/10;
		}
		if(sum==prod){
			System.out.println("it is a spy nmbr");
		}else{
			System.out.println("it is not a spy nmbr");
		}
	}
}
