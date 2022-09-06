import java.util.Scanner;
class Odd_Even
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("TO find odd or evenNumbers");
        System.out.println("Enter your innput");
         int input=scan.nextInt();
         System.out.println((input&1)==1?input+" is Odd":input+" is Even");
     
	}
}