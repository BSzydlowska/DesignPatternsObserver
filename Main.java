
public class Main {

	public static MeteoStation sandomierz = new MeteoStation(0, 0);
	public static void main(String[] args) {
		
		sandomierz.newData(15, 40);
		
		DisplayOne wyswietlacz1 = new DisplayOne();
		DisplayTwo wyswietlacz2 = new DisplayTwo();
		sandomierz.addObs(wyswietlacz1);
		sandomierz.addObs(wyswietlacz2);
		
		sandomierz.updateObs();

		System.out.println("Nowe pomiary:");
		sandomierz.newData(20, 60);
	}
}
