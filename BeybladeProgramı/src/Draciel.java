
public class Draciel extends Beyblade {

	private String kutsalCanavar;

	public Draciel(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
		super(beybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar=kutsalCanavar;
	}
	
	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		
		System.out.println("Kutsal Canavar �smi: "+ kutsalCanavar);
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		super.kutsalCanavarOrtayaCikar();
		
		System.out.println(getBeybladeci()+" "+kutsalCanavar+"'� ortaya ��kar�yor.");
		System.out.println(getBeybladeci()+"'�n Savunmas�: Kale Savunmas�");
	}

	
	
	
}
