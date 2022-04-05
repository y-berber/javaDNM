package ugurHoca;

import java.util.Scanner;

public class alistirma6 {
	public static void main(String[] args) {

		String girdi; // The input line entered by the user.
		int bosluk; // The location of the space in the input.
		String adi; // The first name, extracted from the input.
		String soyadi; // The last name, extracted from the input.
		Scanner scn = new Scanner(System.in);// input scanner nesnemiz.

		System.out.println();
		System.out.println("Lütfen Adýnýzý ve Soyadýnýzý aralarýnda boþluk býrakarak giriniz. örn:\"Yakup Adýgüzel\"");
		girdi = scn.nextLine(); // adý ve soyadýný alýyoruz
		scn.close(); // veri giriþini kapatýyoruz.
		bosluk = girdi.indexOf(' '); // boþluðu tespit ediyoruz
		adi = girdi.substring(0, bosluk); // adýný, girdiden baþluða kadar alýyoruz
		soyadi = girdi.substring(bosluk + 1); // soyadýný, baþluktan itibaren alýyoruz

		// adý ve karakter sayýsýný yazdýrýyoruz. String sýnýfýnýn metodunu kullanýyoruz
		System.out.println("Adýnýz  " + adi + ",adýnýzýn karakter sayýsý " + adi.length() + " karakterdir.");

		// soyadý ve karakter sayýsýný yazdýrýyoruz. String sýnýfýnýn metodunu
		// kullanýyoruz
		System.out.println("Soyadýnýz  " + soyadi + ", soyadýnýzýn karakter sayýsý " + soyadi.length() + " karakterdir.");
		// adý ve soyadýnýn baþharflerii yazdýrýyoruz. String sýnýfýnýn metodunu
		// kullanýyoruz
		System.out.println("Adýnýz ve Soyadýnýzýn baþharfleri " + adi.toUpperCase().charAt(0) + soyadi.toUpperCase().charAt(0));
}
}
