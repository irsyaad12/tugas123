import java.util.*;
class Pengurutan{
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Scanner c = new Scanner(System.in);

		System.out.print("Input nilai : ");
		int angka1 = a.nextInt();
		System.out.print("Input nilai : ");
		int angka2 = b.nextInt();
		System.out.print("Input nilai : ");
		int angka3 = c.nextInt();

		if(angka1 < angka2 && angka1 < angka3){
			System.out.println("Pengurutan : ");
			System.out.println(angka1);
			System.out.println(angka2);
			System.out.println(angka3);
		} else if(angka1 < angka3 && angka1 < angka2){
			System.out.println("Pengurutan : ");
			System.out.println(angka1);
			System.out.println(angka3);
			System.out.println(angka2);
		} else if(angka2 < angka1 && angka2 < angka3){
			System.out.println("Pengurutan : ");
			System.out.println(angka2);
			System.out.println(angka1);
			System.out.println(angka3);
		} else if(angka2 < angka3 && angka2 < angka1){
			System.out.println("Pengurutan : ");
			System.out.println(angka2);
			System.out.println(angka3);
			System.out.println(angka1);
		} else if(angka3 < angka1 && angka3 < angka2){
			System.out.println("Pengurutan : ");
			System.out.println(angka3);
			System.out.println(angka1);
			System.out.println(angka2);
		} else if(angka3 < angka2 && angka3 < angka1){
			System.out.println("Pengurutan : ");
			System.out.println(angka3);
			System.out.println(angka2);
			System.out.println(angka1);
		}
	}
}