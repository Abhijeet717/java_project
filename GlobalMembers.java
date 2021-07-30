import java.util.*;

public class GlobalMembers
{
	
	public static int amt = 720;
	public static Set<String> s = new HashSet<String>();
	public static ArrayList<String> v = new ArrayList<String>(Arrays.asList("Glacier M416", "awm godzilla skin", "new clothes", "jet bag", "new car skin", "spray", "hellfire akm"));
	public static void rearrange()
	{
		Collections.shuffle(v);

	}
	public static void debit()
	{
		String s;
		String s1;
		String s2;
	int x,p;
	System.out.print("enter the amount");
	System.out.print("\n");
	Scanner sc= new Scanner(System.in); 
 x=sc.nextInt();

	for(;;)
   {
		System.out.print("enter your 16 digits debit card number");
		System.out.print("\n");
		s1 = new Scanner(System.in).nextLine();
		try
		{
			if (s1.length() < 16)
			{
				System.out.print("wrong card number");
				System.out.print("\n");
				   throw new IllegalAccessException("hello");
			}

		}
		catch (IllegalAccessException e)
		{continue;


		}break;}
		System.out.print("enter the cvv");
		System.out.print("\n");
		  p=sc.nextInt();
		System.out.print("enter the otp from yoour registered mobile number");
		System.out.print("\n");
	  p=sc.nextInt();
     
		amt = amt + x;
    
	}
	public static void random()
	{	Scanner sc= new Scanner(System.in); 
		int x;
	rearrange();

	for(;;)
   {
	System.out.print("enter your lucky number from 1 to 7");
	System.out.print("\n");
	  x=sc.nextInt();
try
		{if (x < 1 ||x>7)
		{
		   throw new IllegalAccessException("hello");
		}}

	catch (IllegalAccessException e)
	{
System.out.print("wrong lucky number\n");
		continue;
	}
   break;}
	if (s.contains(v.get(x)))
	{System.out.print("again you got");
			System.out.print("\n");
			System.out.print(v.get(x));
			System.out.print("\n");
	
	}
		else
		{
				System.out.print("you got");
		System.out.print("\n");
		System.out.print(v.get(x));
		System.out.print("\n");
		s.add(v.get(x));
		}
		amt = amt - 720;
	}
	public static void main(String[] args)
	{Scanner sc = new Scanner(System.in); 
		char c;
		System.out.print("welcome to the pubg lucky spin");
		System.out.print("\n");
		System.out.print("------- -- --- ---- ----- ----");
		System.out.print("\n");
	System.out.print("press y to continue draw else press any other character to stop");
	System.out.print("\n");
	c = sc.next().charAt(0); 
	for (;c == 'y';)
	{
		if (amt < 720)
		{
		char p;
		System.out.print("your coins are less then 720");
		System.out.print("\n");
	System.out.print("if you want to continue the draw press c else press any other character to stop");
	System.out.print("\n");
	p = sc.next().charAt(0); 
		if (p == 'c')
		{
			debit();
         continue;
		}
		else
		{
			break;
		}
		}
		random();
		System.out.print("press y to continue draw else press any other character to stop");
		System.out.print("\n");
		   c = sc.next().charAt(0);  
	}
	System.out.print("items you got");
	System.out.print("\n");
	System.out.println(s);
	}

}