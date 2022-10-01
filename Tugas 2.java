import java.util.Scanner;
class Hitung
{
	public static void main(String[] args)
		{
		Integer a,b,c ;
		Scanner inputprogram= new Scanner (System.in);
		System.out.print("Bilangan pertama: ");
		a= inputprogram.nextInt();
		System.out.print("Bilangan kedua: ");
		b= inputprogram.nextInt();
		c=a+b;
		System.out.println("\n=========================");
		System.out.print(" Jadi, a + b = "+c);
		System.out.println("\n=========================");
	}
}