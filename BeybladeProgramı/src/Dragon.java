
public class Dragon extends Beyblade {
	
	private String kutsalCanavar;
	private String gizliYetenek;
	public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
		super(beybladeci, donusHizi, saldiriGucu);
		this.gizliYetenek=gizliYetenek;
		this.kutsalCanavar=kutsalCanavar;
	}
	
	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Ad�: "+kutsalCanavar);
		System.out.println("Gizli Yetenek: "+gizliYetenek);
	}
	
	
	
	@Override
	public void kutsalCanavarOrtayaCikar() {
		super.kutsalCanavarOrtayaCikar();
		
		System.out.println(getBeybladeci()+" "+kutsalCanavar+"'� ortaya ��kar�yor.");
		System.out.println(getBeybladeci()+"'�n Sald�r�s�: Hayalet Kas�rga");
	}
	
	
	
	
	
}
