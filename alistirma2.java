package ugurHoca;

public class alistirma2 {

	public static void main(String[] args) {
		int z1; // 1.zar
		int z2; // 2.zar
		int zarToplam; // 1.zar ve2.zar�n toplam�

		z1 = (int) (Math.random() * 6) + 1;// 1.zar i�inrandomdan 0 ile 1 aras�nda say� gelip onu 6 ile �arp�p 0-5 aras�
											// say� elde ediyoruz. 1 ekleyip zara uyarl�yoruz.
		z2 = (int) (Math.random() * 6) + 1;// 2.zar i�in randomdan 0 ile 1 aras�nda say� gelip onu 6 ile �arp�p 0-5
											// aras� say� elde ediyoruz. 1 ekleyip zara uyarl�yoruz.
		zarToplam = z1 + z2;// topluyoruz

		System.out.println("ilk Gelen Zar    :" + z1);
		System.out.println("ikinci Gelen zar :" + z2);
		System.out.println("Zar Toplamlar�   :" + zarToplam);

	}

}
