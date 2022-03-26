package hesapMakinesiSwitchCase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int secim;
		double sayi1,sayi2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Yapmak istediðiniz iþlemi seçiniz\n1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme");
		System.out.println("Seçiminizi girin:");
		secim=scanner.nextInt();
		System.out.println("Ýlk sayýyý giriniz");
		sayi1=scanner.nextDouble();
		System.out.println("Ýkinci sayýyý giriniz");
		sayi2=scanner.nextDouble();
		
		
		switch(secim) {
		
		case 1:
			System.out.println("Ýki sayýnýn toplamý: " + (sayi1+sayi2));
			break;
		case 2:
			System.out.println("iki sayýnýn farký: " + (sayi1-sayi2));
			break;
		case 3:
			System.out.println("iki sayýnýn çarpýmý: " + (sayi1*sayi2));
			break;
		case 4: 
			System.out.println("iki sayýnýn bölümü: " + (sayi1-sayi2));
			break;
		default:
			System.out.println("Girdiðiniz iþlem seçeneði mevcut deðil");
			
		
		}
		
		
		
	}

}
