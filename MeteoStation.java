import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Obserwowany{
	
	private float temperatura;
	private float wilgotność;
	private List<Obserwer> listaObserwerow; 
	
	public MeteoStation(float temperatura, float wilgotność) {
		super();
		this.temperatura = temperatura;
		this.wilgotność = wilgotność;
		this.listaObserwerow = new ArrayList<>();
	}

	public void newData(float temp, float hum){
		this.temperatura = temp;
		this.wilgotność = hum;
		this.updateObs();
	}
	
	@Override
	public void updateObs() {
		for(Obserwer obs:listaObserwerow){
			obs.updateData(this.temperatura, this.wilgotność);
		}
	}

	@Override
	public void addObs(Obserwer obs) {
		listaObserwerow.add(obs);
	}

	@Override
	public void deleteObs(Obserwer obs) {
		int indx = listaObserwerow.indexOf(obs);
		if(indx > 0){
			listaObserwerow.remove(indx);
		}
	}	
}
