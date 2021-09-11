
public class MakineMuhendisi implements IMuhendis,ICalisma {

	@Override
	public void calis() {
		System.out.println("Makine Mühendisi Çalýþýyor...");
		
	}

	private boolean askerlik;
	private boolean adli_sicil;
	
	
	
	
	public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
		
		this.askerlik = askerlik;
		this.adli_sicil = adli_sicil;
	}

	@Override
	public void askerlik_durumu_sorgula() {
	
		if(askerlik) {
			System.out.println("Askerliðimi yaptým.");
			
		}else {
			System.out.println("Askerliðimi henüz yapamdým.");
		}
		
	}

	@Override
	public String mezuniyet_ortlamasi(double derece) {
		
		return "Ortalamam:"+derece;
	}

	@Override
	public void adli_sicil_sorgula() {
	
		if(adli_sicil) {
			System.out.println("Adli Sicil Kaydým Var");
		}else {
			System.out.println("Adli Sicil Kaydým Yok");
		}
	}

	@Override
	public void is_tecrubesi(String[] array) {
		
		if(array.length==0) {
			System.out.println("Ýþ Tecrübem Yok");
		}
		else {
			System.out.println("Makine Mühendisi olarak þu þirketlerde çalýþtým...");
			for(int i =0;i<array.length;i++) {
				System.out.println(array[i]);
			}
		}
		
	}
	
	public void referans_getir(String[] array) {
		if(array.length==0) {
			System.out.println("Referansým Yok");
		}else {
			System.out.println("Referanslarým...");
			for(int i =0;i<array.length;i++) {
				System.out.println(array[i]);
			}
		}
	}
	
	
	

}
