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

		System.out.println("�iftlikten Bu g�n ka� adet yumurta elde ettin ?");
		topYumurta = giris.nextInt();
		giris.close();
		koliOtuzlu = topYumurta / 30;
		otuzludanArtan = topYumurta % 30;
		onluKutu = otuzludanArtan / 10;
		onludanArtanYumurta = otuzludanArtan % 10;

		System.out.println("Toplam yumurta say�n�z: " + topYumurta);
		System.out.println("\nToplam yumurta say�n�zdan elde edece�iniz 30'lu koli adedi: " + koliOtuzlu);
		System.out.println(
				"\nOtuzlu koli yap�m�ndan sonra elinizde kalan yumurtalardan elde edece�iniz 10'lu kutu adedi : "
						+ onluKutu);
		System.out.println("\n10'lu koli yap�m�ndan sonra elinizde kalan yumurta adedi  :" + onludanArtanYumurta);

	}

}
