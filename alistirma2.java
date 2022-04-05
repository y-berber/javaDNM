package ugurHoca;

public class alistirma2 {

	public static void main(String[] args) {
		int z1; // 1.zar
		int z2; // 2.zar
		int zarToplam; // 1.zar ve2.zarýn toplamý

		z1 = (int) (Math.random() * 6) + 1;// 1.zar içinrandomdan 0 ile 1 arasýnda sayý gelip onu 6 ile çarpýp 0-5 arasý
											// sayý elde ediyoruz. 1 ekleyip zara uyarlýyoruz.
		z2 = (int) (Math.random() * 6) + 1;// 2.zar için randomdan 0 ile 1 arasýnda sayý gelip onu 6 ile çarpýp 0-5
											// arasý sayý elde ediyoruz. 1 ekleyip zara uyarlýyoruz.
		zarToplam = z1 + z2;// topluyoruz

		System.out.println("ilk Gelen Zar    :" + z1);
		System.out.println("ikinci Gelen zar :" + z2);
		System.out.println("Zar Toplamlarý   :" + zarToplam);

	}

}
