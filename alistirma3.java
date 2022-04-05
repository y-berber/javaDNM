package ugurHoca;

import java.util.Scanner;

public class alistirma3 {

	public static void main(String[] args) {
		String adGiris; // Giriþ yapýlacak ad
		String buyukAd; // Buyuk Harfe dönüþüm
		Scanner inputText = new Scanner(System.in); // Scanner nesnesi tanýmlýyoruz.
		
		System.out.print("Adýnýzý ve Soyadýnýzý Giriniz: "); // kullanýcýdan veri talep ediyoruz.
		adGiris = inputText.nextLine(); // veri giriþi yapýlan satýrý alýyoruz
		buyukAd = adGiris.toUpperCase(); // veriyi üyük harfe çeviriyoruz
		
		System.out.println("Hoþgeldiniz Sayýn " + buyukAd + ". Tanýþtýðýmýza memnun oldum!");// çýktý istenen metin
		inputText.close(); // veri giriþini kapatýyruz.
	}

}
