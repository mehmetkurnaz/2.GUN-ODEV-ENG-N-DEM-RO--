# 2.GUN-ODEV-ENG-N-DEM-RO--
JAVA KAMPI
package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortıslem = new DortIslem();
		System.out.println(dortıslem.topla(2,3));
		dortıslem.topla1(2,3,5);
System.out.println(dortıslem.topla1(2,3,5));
	}

}
package methodOverloading;

public class DortIslem {
public int topla(int sayi1, int sayi2){
	
	return sayi1+sayi2;
}

public int topla1(int sayi1, int sayi2 , int sayi3){
	
	return sayi1+sayi2+sayi3;
}
}
