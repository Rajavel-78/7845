class Swap_to_numbers
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Swap to Number");
		int first_number=scan.nextInt();
		int Second_number=scan.nextInt();
		System.out.println("Before Swaping "+first_number+" "+second_number);
        first_number=first_number^second_number;
        second_number=first_number^second_number;
        first_number=first_number^second_number;
        System.out.println("After Swaping "+first_number+" "+second_number);

	}
}