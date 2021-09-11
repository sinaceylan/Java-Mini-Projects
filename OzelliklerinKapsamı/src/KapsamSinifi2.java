
public class KapsamSinifi2 {

	private int privateDegisken= 30;
	
	public KapsamSinifi2() {
		
	}
	
	public class DahiliSinif{
		public void onileCarp() {
			
			for(int i=1;i<6;i++) {
				System.out.println(i + "*" +privateDegisken+" = "+(i*privateDegisken));
			}
		}
	}
	
}
