package ugurHoca;

import java.util.Scanner;

public class alistirma4 {

	public static void main(String[] args) {

		int birKurus, besKurus, onKurus, yirmiBesKurus, elliKurus, birLira; // adedi girilecek madeni paralar
																			// 1,5,10,25,50,1
		int besLira, onLira, yirmiLira, elliLira, yuzLira, ikiyuzLira;// adedi girilecek ka��t paralar
																		// 5,10,20,50,100,200.
		Scanner sayici = new Scanner(System.in);// input scanner nesnemiz.
		double parac�k; // toplam param�z� tl,kuru� olarak verecek de�i�kenimiz

		System.out.println("Elindeki t�m paran� tasnif ediniz.");// elindeki paralar� tasnif ettiriyoruz
		System.out.print("Elinizdeki 1 Kuru� adedini giriniz:  ");// 1 kuru�lar tabi hala kald�sa
		birKurus = sayici.nextInt();
		sayici.nextLine();

		System.out.print("Elinizdeki 5 Kuru� adedini giriniz:  ");// 5 kuru� adedi
		besKurus = sayici.nextInt();
		sayici.nextLine();

		System.out.print("Elinizdeki 10 Kuru� adedini giriniz:  ");// 10 kuru� adedi
		onKurus = sayici.nextInt();
		sayici.nextLine();

		System.out.print("Elinizdeki 25 Kuru� adedini giriniz:  ");// 25 kuru� adedi
		yirmiBesKurus = sayici.nextInt();
		sayici.nextLine();

		System.out.print("Elinizdeki 50 Kuru� adedini giriniz:  ");// 50 kuru� adedi
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

		// ve geldik paralar� toplamaya

		parac�k = (0.01 * birKurus) + (0.05 * besKurus) + (0.10 * onKurus) + (0.25 * yirmiBesKurus) + (0.5 * elliKurus)
				+ (1 * birLira) + (5 * besLira) + (10 * onLira) + (20 * yirmiLira) + (50 * elliLira) + (100 * yuzLira)
				+ (200 * ikiyuzLira);
		byte krs = ((byte) ((parac�k % 1) * 100)); // kuru� k�sm�n� al�p yazd�rmada kullanaca��m�z 2 haneli say�ya
													// �eviriyoruz.
		int lira = (int) parac�k; // paray� cast edip yazzd�rmak i�in tam k�sm�n� elde ediyoruz
		sayici.close(); // veri giri�ini kapat�yoruz.
		// kullan�c�ya toplam paras�n� s�yleyece�iz

		System.out.println();
		System.out.println("Toplam Paran�z :  " + lira + " Lira   " + krs + " Kuru�tur");// lira kuru� olarak ��kt�s�.
	}

}
