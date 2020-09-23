//coded by irsyaadul ibaad
import java.util.*;
class BilanganBulat{
	public static  void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);

		System.out.println();
		System.out.print("Masukkan bilanga bulat : ");
		int bulat = a.nextInt();
		System.out.print("Masukkan bilangan ril : ");
		double ril = b.nextDouble();
		long real = (long)ril;
		System.out.println();

		if(bulat > 0){
			System.out.println(bulat + " Merupakan bilangan positif");
		} else if(bulat < 0){
			System.out.println(bulat + " Merupakan bilangan negatif");		
		} 
		if(bulat % 2 == 0){
			System.out.println(bulat + " Merupakan bilangan genap");
		} else if(bulat % 2 != 0){
			System.out.println(bulat + " Merupakan bilangan ganjil");
		}
		System.out.println();
		if(ril % real >= 0.5000000 && real % 2 != 0){
			long hasil = real + 1 ;
			System.out.println("Hasil pembulatan dari " + ril + " adalah : " + hasil);
		} else if(ril % real <= 0.5000000 && real % 2 == 0){
			long hasil = real - 1 ;
			System.out.println("Hasil pembulatan dari " + ril + " adalah : " + hasil);
		} 
	}
}