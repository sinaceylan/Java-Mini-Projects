
public class Main {

	public static void main(String[] args) {
		
		 //IMuhendis muhendis1=new IMuhendis();
		
		PcMuhendisi muhendis1=new PcMuhendisi(false,false);
		
		/*muhendis1.askerlik_durumu_sorgula();
		muhendis1.adli_sicil_sorgula();
		
		System.out.println(muhendis1.mezuniyet_ortlamasi(3.07));
		
		String[] tecrube = {"Vestel","Havelsan","T�rksat"};
		
		muhendis1.is_tecrubesi(tecrube);*/
		
		MakineMuhendisi muhendis2=new MakineMuhendisi(true,false);
		
		String[]tecrube= {};
		String[]referans= {"Sina"};
		
		muhendis2.adli_sicil_sorgula();
		muhendis2.askerlik_durumu_sorgula();
		System.out.println(muhendis2.mezuniyet_ortlamasi(2.31));
		muhendis2.is_tecrubesi(tecrube);
		muhendis2.referans_getir(referans);
		muhendis2.calis();
		
		
		
	}

}
