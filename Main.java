package hesapMakinesiSwitchCase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int secim;
		double sayi1,sayi2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Yapmak istedi�iniz i�lemi se�iniz\n1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
		System.out.println("Se�iminizi girin:");
		secim=scanner.nextInt();
		System.out.println("�lk say�y� giriniz");
		sayi1=scanner.nextDouble();
		System.out.println("�kinci say�y� giriniz");
		sayi2=scanner.nextDouble();
		
		
		switch(secim) {
		
		case 1:
			System.out.println("�ki say�n�n toplam�: " + (sayi1+sayi2));
			break;
		case 2:
			System.out.println("iki say�n�n fark�: " + (sayi1-sayi2));
			break;
		case 3:
			System.out.println("iki say�n�n �arp�m�: " + (sayi1*sayi2));
			break;
		case 4: 
			System.out.println("iki say�n�n b�l�m�: " + (sayi1-sayi2));
			break;
		default:
			System.out.println("Girdi�iniz i�lem se�ene�i mevcut de�il");
			
		
		}
		
		
		
	}

}
