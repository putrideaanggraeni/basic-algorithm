import java.util.*;

class menu{

	public static void	 main (String [] Args){
		Integer pilih;
		double jari,alas,tinggi,Luaspermukaan;
		float panjang,lebar,sisi,Luas;
		Scanner inputprogram= new Scanner (System.in);
		System.out.println("=========================");
		System.out.println("=======^MENU LUAS^=======");
		System.out.println("=========================");
		System.out.println(" 1. Luas Lingkaran");
		System.out.println(" 2. Luas Segitiga");
		System.out.println(" 3. Luas Persegi Panjang");
		System.out.println(" 4. Luas Persegi");
		System.out.println(" 5. EXIT");
		System.out.println("=========================");
		System.out.println("");
		System.out.println("Masukan Pilihan Anda");
			pilih=inputprogram.nextInt();

		switch(pilih){
		case 1: 
			System.out.println("Masukan jari-jari:");
			jari = inputprogram.nextDouble();
			Luaspermukaan=3.14 *jari*jari;
			System.out.println("\n======================");
			System.out.print("Jadi luas lingkaran adalah"+Luaspermukaan);
			System.out.println("\n======================");
			break;
		case 2:
			System.out.println("Masukan alas:");
			alas =inputprogram.nextDouble();
			System.out.println("Masukan tinggi:");
			tinggi =inputprogram.nextDouble();
			Luaspermukaan=0.5 *alas*tinggi;
			System.out.println("\n======================");
			System.out.print("Jadi Luas Segitiga adalah"+Luaspermukaan);
			System.out.println("\n======================");
			break;
		case 3:
			System.out.println("Masukan panjang:");
			panjang = inputprogram.nextFloat ();
			System.out.println("Masukan lebar");
			lebar = inputprogram.nextFloat ();
			Luas= panjang*lebar;
			System.out.println("\n======================");
			System.out.print("Jadi Luas Persegi Panjang adalah"+Luas);
			System.out.println("\n======================");
			break;
		case 4:
			System.out.println("Masukan sisi:");
			sisi=inputprogram.nextFloat();
			Luas=sisi*sisi;
			System.out.println("\n======================");
			System.out.print("Jadi Luas Persegi adalah"+Luas);
			System.out.println("\n======================");
			break;
		case 5:
			System.out.println("Thank You");
			System.exit(0);
			break;
		default:
		System.out.println("Error !");
		}
	}
}
