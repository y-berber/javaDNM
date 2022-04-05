package ugurHoca;

import java.util.Scanner;

public class alistirma4 {

	public static void main(String[] args) {

		int birKurus, besKurus, onKurus, yirmiBesKurus, elliKurus, birLira; // adedi girilecek madeni paralar
																			// 1,5,10,25,50,1
		int besLira, onLira, yirmiLira, elliLira, yuzLira, ikiyuzLira;// adedi girilecek kaðýt paralar
																		// 5,10,20,50,100,200.
		Scanner sayici = new Scanner(System.in);// input scanner nesnemiz.
		double paracýk; // toplam paramýzý tl,kuruþ olarak verecek deðiþkenimiz

		System.out.println("Elindeki tüm paraný tasnif ediniz.");// elindeki paralarý tasnif ettiriyoruz
		System.out.print("Elinizdeki 1 Kuruþ adedini giriniz:  ");// 1 kuruþlar tabi hala kaldýsa
		birKurus = sayici.nextInt();
		sayici.nextLine();

		System.out.print("Elinizdeki 5 Kuruþ adedini giriniz:  ");// 5 kuruþ adedi
		besKurus = sayici.nextInt();
		sayici.nextLine();

		System.out.print("Elinizdeki 10 Kuruþ adedini giriniz:  ");// 10 kuruþ adedi
		onKurus = sayici.nextInt();
		sayici.nextLine();

		System.out.print("Elinizdeki 25 Kuruþ adedini giriniz:  ");// 25 kuruþ adedi
		yirmiBesKurus = sayici.nextInt();
		sayici.nextLine();

		System.out.print("Elinizdeki 50 Kuruþ adedini giriniz:  ");// 50 kuruþ adedi
		elliKurus = sayici.nextInt();
		sayici.nextLine();

		System.out.print("Elinizdeki 1 lira adedini giriniz:  ");// 1 lira adedi
		birLira = sayici.nextInt();
		sayici.nextLine();

		System.out.print("Elinizdeki 5 lira adedini giriniz:  ");// 5 lira adedi
		besLira = sayici.nextInt();
		sayici.nextLine();

		System.out.print("Elinizdeki 10 lira adedini giriniz:  ");// 10 lira adedi
		onLira = sayici.nextInt();
		sayici.nextLine();

		System.out.print("Elinizdeki 20 lira adedini giriniz:  ");// 20 lira adedi
		yirmiLira = sayici.nextInt();
		sayici.nextLine();

		System.out.print("Elinizdeki 50 lira adedini giriniz:  ");// 50 lira adedi
		elliLira = sayici.nextInt();
		sayici.nextLine();

		System.out.print("Elinizdeki 100 lira adedini giriniz:  ");// 100 lira adedi
		yuzLira = sayici.nextInt();
		sayici.nextLine();

		System.out.print("Elinizdeki 200 lira adedini giriniz:  ");// 200 lira adedi
		ikiyuzLira = sayici.nextInt();
		sayici.nextLine();

		// ve geldik paralarý toplamaya

		paracýk = (0.01 * birKurus) + (0.05 * besKurus) + (0.10 * onKurus) + (0.25 * yirmiBesKurus) + (0.5 * elliKurus)
				+ (1 * birLira) + (5 * besLira) + (10 * onLira) + (20 * yirmiLira) + (50 * elliLira) + (100 * yuzLira)
				+ (200 * ikiyuzLira);
		byte krs = ((byte) ((paracýk % 1) * 100)); // kuruþ kýsmýný alýp yazdýrmada kullanacaðýmýz 2 haneli sayýya
													// çeviriyoruz.
		int lira = (int) paracýk; // parayý cast edip yazzdýrmak için tam kýsmýný elde ediyoruz
		sayici.close(); // veri giriþini kapatýyoruz.
		// kullanýcýya toplam parasýný söyleyeceðiz

		System.out.println();
		System.out.println("Toplam Paranýz :  " + lira + " Lira   " + krs + " Kuruþtur");// lira kuruþ olarak çýktýsý.
	}

}
