import java.util.Scanner;

class menu{
	
	public static void main (String[] args) {
		Integer pilih;
		Scanner input = new Scanner(System.in);
		System.out.println("********SELAMAT DATANG**********");
		System.out.println("Pilihan Menu	:");
		System.out.println("1. Soto");
		System.out.println("2. Seblak");
		System.out.println("");
				pilih=input.nextInt();
		switch(pilih){
			case 1:
				System.out.println("Menu yang anda pilih Soto");
				break;
			case 2:
				System.out.println("Menu yang anda pilih Seblak");
				break;
			default:
				System.out.println("Eror !");
		}
	}
}

