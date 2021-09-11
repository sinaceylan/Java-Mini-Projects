
public class Abone {

	public String isim;
	public String sehir;
	public int bakiye;
	
	public void dogalgaz_kullan(int miktar) {
		if((this.bakiye-miktar)<0) {
			System.out.println("Yeterli bkaiye yok.");
		}else {
			this.bakiye-=miktar;
			if(this.bakiye<=0) {
				System.out.println("Bakiyeniz bitmiþtir.Lütfen yükleme yapýnýz. \nKredi limiti = 120 TL");
			}else {
				System.out.println("Yeni Bakiye = "+ bakiye);
			}
		}
	}
	
	public void bakiye_ogren() {
		System.out.println("Bakiye = "+bakiye);
	}
	
	
	
	
	
	
	
	
}
