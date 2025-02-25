import java.util.Scanner;
class Perfectsquare 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the number");
			int num =sc.nextInt();
		for(int i =1;i<=num;i++){
			if(num==i*i){
				System.out.println(num+"perfectsquare is"+i);
			}
		}

	}
}
