
public class Yonetici extends Calisan { //Subclass
	
	private int sorumlu_kisi; //Ekstra Özellik

	public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {
		/*this.isim=isim;
		this.maas=maas;
		this.departman=departman;*/
	
		super(isim,departman,maas);
		
		this.sorumlu_kisi=sorumlu_kisi;

	}
	
	public void zam_yap(int zam_miktarý) {
		System.out.println("Çalýþanlara " +zam_miktarý+ " TL zam yapýldý.");
	}
	
	public void bilgilerigoster() {
		/*System.out.println("Ýsim: "+getIsim());
		System.out.println("Maaþ: "+getMaas());
		System.out.println("Departman: "+getDepartman());
		*/
		super.bilgilerigoster();
		System.out.println("Sorumlu kiþi sayýsý: "+this.sorumlu_kisi);
	}
	
	
	
	
	
	
	
	
}
