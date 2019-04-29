
public class Convert {

	// convert USD to AUD
	public double Convert(double cost) {
		//current exchange rate: AUD = USD x 1.41804
		
		cost *= 1.41804;
		
		return cost;
	}
}
