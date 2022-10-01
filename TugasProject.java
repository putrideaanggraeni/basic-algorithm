import java.util.*;
class project{
	public static void main (String[] args){
	Scanner input = new Scanner (System.in);
	String nama,tgl,noantri, noktp, kelastambahan, jeniskelas, jeniskendaraan,ulang;
	float pilih;	
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	System.out.println("------------------------------------------------------");
	System.out.println("---------SELAMAT DATANG DI KAPAL SINAR BINTANG--------");
	System.out.println("------------------MERAK-BANGKAUHENI-------------------");
	System.out.println("------------------------------------------------------");
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	do
	{
	System.out.println("");
	System.out.println("Berikut Tarif Kelas Kapal Sinar Bintang : ");
	System.out.println("\n======================^^^^^^==========================");
	System.out.println("1. Tarif Kelas VIP		: Rp. 100.000");
	System.out.println("2. Tarif Kelas Ekonomi		: Rp. 50.000");
	System.out.println("\n======================^^^^^^==========================");
	System.out.println("");
	System.out.print("Masukkan Nama Anda		: ");
	nama = input.nextLine(); 
	System.out.println("\n------------------------------------------------------");
	System.out.print("Masukkan Hari dan Tanggal Keberangkatan	: ");
	tgl = input.nextLine();
	System.out.println("\n------------------------------------------------------");
	System.out.println("");
	System.out.print("Masukkan Nomor Antrean Anda	: ");
	noantri = input.nextLine();
	System.out.println("\n------------------------------------------------------");
	System.out.println("");
	System.out.print("Masukkan No KTP Anda 		: ");
	noktp = input.nextLine();
	System.out.println("\n------------------------------------------------------");
	System.out.println("");
	System.out.print("Silahkan Pilih Kelas		: ");
	pilih=input.nextFloat();
	System.out.println("\n======================^^^^^^==========================");
	int tiket,harga,uang,Jumlah,total,kendaraan,kembalian,hk;
	if ( pilih == 1 ){
		System.out.println("");
		System.out.println("Anda Memilih Kelas VIP");
		System.out.println("Harga Tiket	: Rp. 100.000/Tiket");
		System.out.println("" );
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("");
		System.out.println("Fasilitas	:");
		System.out.println("- Ruangan Ber-AC");
		System.out.println("- Tersedia Karaoke");
		System.out.println("- Tempat Bermain Anak");
		System.out.println("- Cafee");
		System.out.println("- Bioskop Mini");
		System.out.println("- Meeting Room");
		System.out.println("- Apotek");
		System.out.println("- Kamar mandi");
		System.out.println("- Tersedia Televisi");
		System.out.println("- Tempat Beribadah");
		System.out.println("");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("");
		System.out.println("Jenis Kendaraan	:");
		System.out.println("1. Kendaraan Kecil ");
		System.out.println(" - Motor ");
		System.out.println(" - Mobil ");
		System.out.println("2. Kendaraan Besar ");
		System.out.println(" - Tronton ");
		System.out.println(" - Truk ");
		System.out.println("3. Tanpa Kendaraan");
		System.out.println("");
		System.out.print("Silahkan Masukkan Jenis Kendaraan Anda : ");
		kendaraan=input.nextInt();
		System.out.println("");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		if ( kendaraan == 1){
			System.out.println("Kendaraan Kecil	");
			System.out.println("Tarif Kendaraan	: Rp. 35.000/Tiket");
		}
		else if ( kendaraan == 2){
			System.out.println("Kendaraan Besar	");
			System.out.println("Tarif Kendaraan	: Rp. 75.000/Tiket");
			}
		else if ( kendaraan == 3){
			System.out.println("Tanpa Kendaraan");
		}
		else{
			System.out.println("Erorr !!!");
		}
	}	
	if ( pilih == 2){
		System.out.println("");
		System.out.println("Anda Memilih Kelas Ekonomi");
		System.out.println("Harga tiket	: Rp. 50.000/Tiket");
		System.out.println("");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("");
		System.out.println("Fasilitas	:");
		System.out.println("- Tempat Bermain Anak");
		System.out.println("- Tersedia Karaoke");
		System.out.println("- Cafee");
		System.out.println("- Apotek");
		System.out.println("- Kamar Mandi");
		System.out.println("- Tersedia Televisi");
		System.out.println("- Tempat Beribadah");
		System.out.println("");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("");
		System.out.println("Jenis Kendaraan	:");
		System.out.println("1. Kendaraan Kecil ");
		System.out.println(" - Motor ");
		System.out.println(" - Mobil ");
		System.out.println("2. Kendaraan Besar ");
		System.out.println(" - Tronton ");
		System.out.println(" - Truk ");
		System.out.println("3. Tanpa Kendaraan");
		System.out.println("");
		System.out.print ("Silahkan Masukan Jenis Kendaraan Anda : ");
		kendaraan=input.nextInt();
		System.out.println("");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		if ( kendaraan == 1){
			System.out.println("Kendaraan Kecil	");
			System.out.println("Tarif Kendaraan	: Rp. 35.000/Tiket");
		}
		else if ( kendaraan == 2){
			System.out.println("Kendaraan Besar	");
			System.out.println("Tarif Kendaraan	: Rp. 75.000/Tiket");
		}
		else if ( kendaraan == 3){
			System.out.println("Tanpa Kendaraan");
		}
		else{
			System.out.println("Erorr !!!");
		}
	}
		System.out.println("\n======================^^^^^^==========================");
		System.out.println("");
		System.out.print("Harga Tiket Kelas	: ");
		harga = input.nextInt();
		System.out.print("Jumlah Tiket		: ");
		Jumlah = input.nextInt();
		System.out.print("Harga Tiket Kendaraan	: ");
		hk = input.nextInt();
		total=harga*Jumlah+hk;
		System.out.println("");
		System.out.println("\n======================^^^^^===========================");
		System.out.println("\n^^^^^^^^^^^^^^^^^^^^^RESI PEMBELI^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Nama Anda Adalah	: "+nama);
		System.out.println("Hari dan Tanggal Keberangkatan Anda Adalah	: "+tgl);
		System.out.println("Nomor Antre Anda Adalah	: "+noantri);
		System.out.println("Nomor KTP Anda Adalah	: "+noktp);
		System.out.println("Anda Memilih Kelas	: "+pilih);
		System.out.println("Jumlah Tiket Anda	: "+Jumlah);
		System.out.println("Tujuan			: Merak-Bangkauheni");
		System.out.print("Total Tarif		: "+total);
		System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("\n======================================================");
		System.out.print("Pembayaran		: ");
		uang = input.nextInt();
		kembalian=uang-total;
		System.out.println("");
		System.out.print("Kembali Anda		: "+kembalian);
		System.out.println("\n=====================================================");
		System.out.println("\n=====================================================");
		System.out.println("");
		System.out.println("Apakah Anda Ingin Mengulang Pembayaran? [Yes/No]");
		ulang = input.next();
		input.nextLine();
		}while(ulang.equals ("Yes") | ulang.equals("yes"));
		System.out.println("\n=====================================================");
	}
} 