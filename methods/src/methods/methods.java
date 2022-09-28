package methods;

public class methods {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

	}

//camel casing
	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean varmi = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varmi = true;
				break;
			}
		}
		String mesaj="";
		if (varmi) {
			mesajVer("Sayı mevcuttur: "+aranacak);
			mesajVer(mesaj);
		} else {

			mesajVer("Sayı mevcut değildir: "+aranacak);
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}
}
