
public class BeybladeFabrikasi {

	public Beyblade beybladeUret(String beyblade_turu) {
		
		if(beyblade_turu.equals("Dragon")) {
			return new Dragon("Takao",800,300,"Mavi Ejderha","Kutsal Canavar ile Konu�ma");
			
		}else if(beyblade_turu.equals("Dranza")) {
			return new Dranza("Kai",600,400,"K�rm�z� Anka Ku�u");
		}else if(beyblade_turu.equals("Drayga")) {
			return new Dranza("Rei",850,250,"Beyaz Kaplan");
		}else if(beyblade_turu.equals("Draciel")) {
			return new Dranza("Max",600,400,"Kara Kaplumba�a");
		}else {
			return null;
		}
	}
	
}
