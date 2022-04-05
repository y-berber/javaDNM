package ugurHoca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class alistirma7 {

	public static void main(String[] args) {
		String adSoyad; 		 // ogrencinin dosyadan alýnan ad
		int not1, not2, not3;	 // ogrencinin 3 adet ders notu
		double ortalama;		 // ders notu ortalamasi
		Scanner scn;	//sanner nesnesi	
		try {
			scn = new Scanner(new File("G:/eclipse/YAKUP_WORKSPACE/ugurHoca/src/ugurHoca/ogrenciVeNotlar.txt"));

			adSoyad = scn.next();
			not1 = scn.nextInt();
			not2 = scn.nextInt();
			not3 = scn.nextInt();
			ortalama=((not1+not2+not3)/3.0);
			System.out.printf("%s icin ortalama not %1.2f oldu", adSoyad  ,ortalama );
			System.out.println();
			scn.close();
		} catch (FileNotFoundException e) {

			System.out.println("Dosya yerinde bulunamadi" + e.getMessage());
			e.printStackTrace();
	}

}}
