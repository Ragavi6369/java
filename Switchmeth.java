import java.util.Scanner;
class Switchmeth
{

	public static int reverse(int n)
	{

		int r=0;
		while (n!=0)
		{
			int a=n%10;
			r=(r*10)+a;
			n=n/10;
		}
		return r;
	}

	public static int square(int n)
	{
		return n*n;
	}

	public static int  adam(int f,int se)
	{
		if (f==se)
		{
			System.out.println("It is Adam number");
		}
		else
		{
			System.out.println("It is not Adam number");
		}
		return f;

	}
	

	public static void main(String args[])
	{

		Scanner s=new Scanner(System.in);
		System.out.print("Enter your choice :");
		int c=s.nextInt();


		{
			switch(c)
			{
				case 1:
				{
					System.out.print("Enter the number :");
					int n=s.nextInt();
					int f=reverse(square(n));
					System.out.println(f);
					int se=square(reverse(n));
					System.out.println(se);
					adam(f,se);
					break;
				}
				
				default:
				{
					System.out.println("Exit");
					break;
				}
			}
		}
	}
}
