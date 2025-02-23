class Swapnumbers 
{
	public static void main(String[] args) 
	{
		int a =10;
		int b =30;
		
		a=b+a;//30+10=40

		b=a-b;//40-30=10
        a=a-b;//40-10=30
		
		System.out.println(a);
		System.out.println(b);
    System.out.println("*************Re_Swapping**************");
		b=a+b;
		a=b-a;//40-30=10
		b=b-a;//40-10=30
        System.out.println(a);
		System.out.println(b);
		
	}
}
