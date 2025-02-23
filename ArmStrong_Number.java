import java.util.Scanner;
class  ArmStrong_Number
{
	public static void main(String[] args) 
	{

Scanner sc= new Scanner(System.in);

System.out.println("Enter the numbr");
int num = sc.nextInt();
int n = num;
int count=0;

while (n!= 0){
n= n/10;
count++;
}
 int sum=0;
while (num!= 0){
int rem =num%10;
int power = count;
int Product=1;
while (power!=0){

Product= Product * rem;
power--;
}

sum=sum+ Product;

num = num/10;
}

if(sum==n) {
System.out.println("It is Armstrong");
}else{
System.out.println("It's not Aramstrong");
}
     
		
	}
}
