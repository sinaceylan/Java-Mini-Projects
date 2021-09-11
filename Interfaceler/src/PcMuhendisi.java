
public class PcMuhendisi implements IMuhendis {

	private boolean askerlik;
	private boolean adli_sicil;
	
	
	
	
	public PcMuhendisi(boolean askerlik, boolean adli_sicil) {
		
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
		
		System.out.println("Bilgisayar Mühendisi Olarak Þu Þirketlerde Çalýþtým...");
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		
	}

	
	
	
	
	
}
