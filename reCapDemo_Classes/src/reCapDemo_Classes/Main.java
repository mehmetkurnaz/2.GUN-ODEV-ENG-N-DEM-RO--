package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortıslem = new DortIslem();

		int sonuc1 = dortıslem.Topla(3, 4);
		int sonuc2 = dortıslem.Cikar(3, 4);
		int sonuc3 = dortıslem.Carp(3, 4);
		int sonuc4 = dortıslem.Bol(3, 4);
		System.out.println(sonuc1);
		System.out.println(sonuc2);
		System.out.println(sonuc3);
		System.out.println(sonuc4);
	}

}
