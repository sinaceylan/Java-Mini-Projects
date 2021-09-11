
public class Main {

	public static void main(String[] args) {
		String[] kanallar= {"Radyo Viva","Radyo Fenomen","Alem FM","Kral Pop","Radyo Hacettepe"};
		Radyo radyo = new Radyo(kanallar);
		
		for (String s:radyo) {
			System.out.println(s);
		}

	}

}
