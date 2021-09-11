
public class Yonetici extends Calisan { //Subclass
	
	private int sorumlu_kisi; //Ekstra �zellik

	public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {
		/*this.isim=isim;
		this.maas=maas;
		this.departman=departman;*/
	
		super(isim,departman,maas);
		
		this.sorumlu_kisi=sorumlu_kisi;

	}
	
	public void zam_yap(int zam_miktar�) {
		System.out.println("�al��anlara " +zam_miktar�+ " TL zam yap�ld�.");
	}
	
	public void bilgilerigoster() {
		/*System.out.println("�sim: "+getIsim());
		System.out.println("Maa�: "+getMaas());
		System.out.println("Departman: "+getDepartman());
		*/
		super.bilgilerigoster();
		System.out.println("Sorumlu ki�i say�s�: "+this.sorumlu_kisi);
	}
	
	
	
	
	
	
	
	
}
