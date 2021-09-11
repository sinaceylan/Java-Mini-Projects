
public class Drayga extends Beyblade {
	private String kutsalCanavar;

	public Drayga(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
		super(beybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar=kutsalCanavar;
	}

	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		
		System.out.println("Kutsal Canavar Ýsmi: "+ kutsalCanavar);
	}
	
	@Override
	public void kutsalCanavarOrtayaCikar() {
		super.kutsalCanavarOrtayaCikar();
		
		System.out.println(getBeybladeci()+" "+kutsalCanavar+"'ý ortaya çýkarýyor.");
		System.out.println(getBeybladeci()+"'ýn Saldýrýsý: Kaplan Pençesi");
	}

	
	
	
	
	
}
