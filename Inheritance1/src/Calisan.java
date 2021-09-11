
public class Calisan { //Superclass veya Baseclass

	private String isim;
	private String departman;
	private int maas;
	
	public Calisan(String isim, String departman, int maas) {
		this.isim = isim;
		this.departman = departman;
		this.maas = maas;
	}
	
	public void calis() {
		System.out.println("Çalýþan Çalýþýyor...");
	}
	
	public void bilgilerigoster() {
		System.out.println("Ýsim: "+isim);
		System.out.println("Maaþ: "+maas);
		System.out.println("Departman: "+departman);
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public void departmandegistir(String yeni_departman) {
		System.out.println("Departman deðiþtiriliyor...");
		this.departman= yeni_departman;
		
		System.out.println("Yeni departman: "+ this.departman);
	}
	
	
}
