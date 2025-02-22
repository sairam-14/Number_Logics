import java.util.Scanner;
class Fabnosi 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nmbr");
		int num = sc.nextInt();
		int a =0;
		int b =1;
		int c= a+b;

		System.out.println(a);
		System.out.println(b);
		while(c<=num){
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
		
	}
}
