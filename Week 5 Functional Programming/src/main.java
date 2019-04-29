import java.text.DecimalFormat;

/**
 * 
 */

/**
 * @author quillan.ogle
 *
 */
public class main {

	public static void main(String[] args) {
		Costs costs = new Costs();
		Convert convert = new Convert();
		DecimalFormat formatter = new DecimalFormat("#,###.00"); //format for dollar values
		
		//setup costs from user
		double travel = costs.gettravelCosts();
		double hotel = costs.gethotelCosts();
		double rental = costs.getrentalCosts();
		double labor = costs.getlaborCosts();
		
		//convert from USD to AUD and Print
		System.out.printf("Travel Cost: $" + formatter.format(travel) + " converts to " + 
				formatter.format(convert.Convert(travel)) + " AUD");
		System.out.printf("\nHotel Cost: $" + formatter.format(hotel) + " converts to " + 
				formatter.format(convert.Convert(hotel)) + " AUD");
		System.out.printf("\nRental Car Cost: $" + formatter.format(rental) + " converts to " + 
				formatter.format(convert.Convert(rental)) + " AUD");
		System.out.printf("\nLabor Cost: $" + formatter.format(labor) + " converts to " + 
				formatter.format(convert.Convert(labor)) + " AUD");
	}


}
