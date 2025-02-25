import java.util.Scanner;
class Ascii_Palidrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		 int ascii = ch;
		 System.out.println("Character Ascii is"+ascii);
		 int n = ascii;
		 int rev =0;
		 while (ascii!=0)
		 {
			 int rem = ascii%10;
              rev=rev*10+rem;
			 ascii=ascii/10;
		 }

		 if(rev==n){
			 System.out.println("Given Character Ascii is Palidrome");
		 }else{
			 System.out.println("Given Character Ascii is Not Paidrome");
		 }
		

	}
}
