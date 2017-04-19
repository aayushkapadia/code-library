package Test.IO;

import Source.IO.MyScanner;

public class MyScannerTest
{
	public static void main(String[] args)
	{
		MyScanner sc = new MyScanner();
		System.out.println(sc.nextLine());
		System.out.println(sc.next());
		System.out.println(sc.nextInt());
		System.out.println(sc.next());
		System.out.println(sc.nextDouble());
		System.out.println(sc.nextLine());
		System.out.println(sc.next());
		System.out.println(sc.nextLong());
	}
}
