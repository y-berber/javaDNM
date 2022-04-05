package ugurHoca;

import java.util.Scanner;

public class alistirma5 {

	public static void main(String[] args) {
		int topYumurta;
		int koliOtuzlu;
		int otuzludanArtan;
		int onluKutu;
		int onludanArtanYumurta;
		Scanner giris = new Scanner(System.in);// input scanner nesnemiz.

		System.out.println("Çiftlikten Bu gün kaç adet yumurta elde ettin ?");
		topYumurta = giris.nextInt();
		giris.close();
		koliOtuzlu = topYumurta / 30;
		otuzludanArtan = topYumurta % 30;
		onluKutu = otuzludanArtan / 10;
		onludanArtanYumurta = otuzludanArtan % 10;

		System.out.println("Toplam yumurta sayýnýz: " + topYumurta);
		System.out.println("\nToplam yumurta sayýnýzdan elde edeceðiniz 30'lu koli adedi: " + koliOtuzlu);
		System.out.println(
				"\nOtuzlu koli yapýmýndan sonra elinizde kalan yumurtalardan elde edeceðiniz 10'lu kutu adedi : "
						+ onluKutu);
		System.out.println("\n10'lu koli yapýmýndan sonra elinizde kalan yumurta adedi  :" + onludanArtanYumurta);

	}

}
