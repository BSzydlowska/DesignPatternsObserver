
public class DisplayOne implements Obserwer{

	private float temp;
	private float humi;
	private float tempOld;
		
	@Override
	public void updateData(float temp, float hum) {
		tempOld = this.temp;
		this.temp = temp;
		this.humi = hum;
		System.out.println("Temp aktualna: " + this.temp + " Zmiana temperatury: " + 
						(this.tempOld - this.temp) + " Wilgotnosc powietrza: " + this.humi );
	}
	

}
