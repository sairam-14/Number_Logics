import java.util. Scanner;

class Strongnmbr {

public static void main(String[] args) {

Scanner Sc= new Scanner(System.in);
System.out.println("Enter the number");

int num= Sc.nextInt();

int n= num;

int Sum = 0;

while(num!=0){

int rem =num %10;

int Product = 1;

for (int i= rem;i>=1;i--){

Product = Product *i;
}

Sum = Sum+ Product;

num = num/10;
}
if(n== Sum){

System.out.println ("It is a strong number");

}else {

System.out.println  ("It is not Strong numbr");
}
}
}