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
		System.out.println("L�tfen Ad�n�z� ve Soyad�n�z� aralar�nda bo�luk b�rakarak giriniz. �rn:\"Yakup Ad�g�zel\"");
		girdi = scn.nextLine(); // ad� ve soyad�n� al�yoruz
		scn.close(); // veri giri�ini kapat�yoruz.
		bosluk = girdi.indexOf(' '); // bo�lu�u tespit ediyoruz
		adi = girdi.substring(0, bosluk); // ad�n�, girdiden ba�lu�a kadar al�yoruz
		soyadi = girdi.substring(bosluk + 1); // soyad�n�, ba�luktan itibaren al�yoruz

		// ad� ve karakter say�s�n� yazd�r�yoruz. String s�n�f�n�n metodunu kullan�yoruz
		System.out.println("Ad�n�z  " + adi + ",ad�n�z�n karakter say�s� " + adi.length() + " karakterdir.");

		// soyad� ve karakter say�s�n� yazd�r�yoruz. String s�n�f�n�n metodunu
		// kullan�yoruz
		System.out.println("Soyad�n�z  " + soyadi + ", soyad�n�z�n karakter say�s� " + soyadi.length() + " karakterdir.");
		// ad� ve soyad�n�n ba�harflerii yazd�r�yoruz. String s�n�f�n�n metodunu
		// kullan�yoruz
		System.out.println("Ad�n�z ve Soyad�n�z�n ba�harfleri " + adi.toUpperCase().charAt(0) + soyadi.toUpperCase().charAt(0));
}
}
