package ugurHoca;

import java.util.Scanner;

public class alistirma3 {

	public static void main(String[] args) {
		String adGiris; // Giri� yap�lacak ad
		String buyukAd; // Buyuk Harfe d�n���m
		Scanner inputText = new Scanner(System.in); // Scanner nesnesi tan�ml�yoruz.
		
		System.out.print("Ad�n�z� ve Soyad�n�z� Giriniz: "); // kullan�c�dan veri talep ediyoruz.
		adGiris = inputText.nextLine(); // veri giri�i yap�lan sat�r� al�yoruz
		buyukAd = adGiris.toUpperCase(); // veriyi �y�k harfe �eviriyoruz
		
		System.out.println("Ho�geldiniz Say�n " + buyukAd + ". Tan��t���m�za memnun oldum!");// ��kt� istenen metin
		inputText.close(); // veri giri�ini kapat�yruz.
	}

}
