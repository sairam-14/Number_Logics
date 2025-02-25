import java.util.Scanner;
class Evendigits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count =0;
		while(num!=0){
			int reminder =num%10;
			if(reminder%2==0){

				count++;
			}
			num=num/10;
		}
		System.out.println("Even digit count"+count);
		
	}
}
