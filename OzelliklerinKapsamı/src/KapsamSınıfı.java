
public class KapsamS�n�f� {

	private int privateDegisken=30;

	public KapsamS�n�f�() {
		System.out.println("privateDegisken = "+privateDegisken);
		
	}
	
	public void onileCarp() {
		int privateDegisken=10;
		
		for(int i=1;i<6;i++) {
			System.out.println(i + "*" +privateDegisken+" = "+(i*privateDegisken));
		}
	}
}
