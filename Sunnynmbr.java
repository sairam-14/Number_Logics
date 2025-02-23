import java.util.Scanner;
class Sunnynmbr 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nmbr");
		int num = sc.nextInt();
		int point =0;
		for(int i =1;i<=num;i++){
			if(i*i==(num+1)){  //2*2=4==5+1
				point++;
			}
		}
		if(point!=0){
          System.out.println(num+"is a sunny num");
		}else{
			System.out.println(num+"its not a sunny numbr");
		}
	}
}
