
public class DisplayTwo implements Obserwer{

	private float temp;
	private float humi;

	@Override
	public void updateData(float temp, float hum) {
		this.temp = temp;
		this.humi = hum;
		System.out.println("Temp aktualna: " + this.temp + " Wilgotnosc powietrza: " + this.humi );
	}
}
