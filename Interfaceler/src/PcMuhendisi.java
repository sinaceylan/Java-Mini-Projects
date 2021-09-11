
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
			System.out.println("Askerli�imi yapt�m.");
			
		}else {
			System.out.println("Askerli�imi hen�z yapamd�m.");
		}
		
	}

	@Override
	public String mezuniyet_ortlamasi(double derece) {
		
		return "Ortalamam:"+derece;
	}

	@Override
	public void adli_sicil_sorgula() {
		if(adli_sicil) {
			System.out.println("Adli Sicil Kayd�m Var");
		}else {
			System.out.println("Adli Sicil Kayd�m Yok");
		}
		
	}

	@Override
	public void is_tecrubesi(String[] array) {
		
		System.out.println("Bilgisayar M�hendisi Olarak �u �irketlerde �al��t�m...");
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		
	}

	
	
	
	
	
}
