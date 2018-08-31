import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Obserwowany{
	
	private float temperatura;
	private float wilgotnoœæ;
	private List<Obserwer> listaObserwerow; 
	
	public MeteoStation(float temperatura, float wilgotnoœæ) {
		super();
		this.temperatura = temperatura;
		this.wilgotnoœæ = wilgotnoœæ;
		this.listaObserwerow = new ArrayList<>();
	}

	public void newData(float temp, float hum){
		this.temperatura = temp;
		this.wilgotnoœæ = hum;
		this.updateObs();
	}
	
	@Override
	public void updateObs() {
		for(Obserwer obs:listaObserwerow){
			obs.updateData(this.temperatura, this.wilgotnoœæ);
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
