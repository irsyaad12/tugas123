import java.util.Scanner;
class JarakManhattan{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		Scanner d = new Scanner(System.in);

		System.out.print("Input x1 = ");
		int x1 = a.nextInt();
		System.out.print("Input x2 = ");
		int x2 = b.nextInt();
		System.out.print("Input y1 = ");
		int y1 = c.nextInt();
		System.out.print("Input y2 = ");
		int y2 = d.nextInt();

		int pengurangan1 = x1 - x2 ;
		int pengurangan2 = y1 - y2 ;

		int h1 = pengurangan1 + pengurangan2;
		int z = 0 - 1 ;

		int mutlak1 = pengurangan1 * z ;
		int mutlak2 = pengurangan2 * z ;

		int hasil1 = mutlak1 + pengurangan2 ;
		int hasil2 = mutlak2 + pengurangan1 ;
		int hasil3 = mutlak1 + mutlak2 ;
		int hasil4 = pengurangan1 + pengurangan2 ;

		if(pengurangan1 < 0 && pengurangan2 > 0){
			System.out.println("Jarak Manhattan dari koordinat (" + x1 + "," + y1 + ") ke (" + x2 + "," + y2 + ") adalah = " + hasil1);
		} else if(pengurangan2 < 0 && pengurangan1 > 0){
			System.out.println("Jarak Manhattan dari koordinat (" + x1 + "," + y1 + ") ke (" + x2 + "," + y2 + ") adalah = " + hasil2);
		} else if(pengurangan1 < 0 && pengurangan2 < 0){
			System.out.println("Jarak Manhattan dari koordinat (" + x1 + "," + y1 + ") ke (" + x2 + "," + y2 + ") adalah = " + hasil3);
		} else if(pengurangan1 > 0 && pengurangan2 > 0){
			System.out.println("Jarak Manhattan dari koordinat (" + x1 + "," + y1 + ") ke (" + x2 + "," + y2 + ") adalah = " + hasil4);
		}
		


	}
}