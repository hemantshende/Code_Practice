

interface Food {
	double priceforfood(double price_of_food, double weight_of_food);
}

interface ElectronicsApp {
	double priceforElectronics(double price_of_Ele, double weight_of_Ele);
}

class HappyDeliverycompany implements Food,ElectronicsApp{
	 
	public double priceforfood(double price_of_food, double weight_of_food) {
		double price = ((price_of_food + weight_of_food) * 0.2 )+ 12;
		return price;
	}
	public double priceforElectronics(double price_of_Ele, double weight_of_Ele) {
		double price = ((price_of_Ele + weight_of_Ele) * 0.4) + 5;
		return price;
	}
}


class QuickDeliverycompany implements Food, ElectronicsApp {
	public double priceforfood(double price_of_food, double weight_of_food) {
		double price = ((price_of_food + weight_of_food) * 0.2 )+ 12;
		return price;
	}

	public double priceforElectronics(double price_of_Ele, double weight_of_Ele) {
		double price = ((price_of_Ele + weight_of_Ele) * 0.4) + 5;
		return price;
	}
}

public class Visitor {

	public static void main(String[] args) {
		HappyDeliverycompany hd=new HappyDeliverycompany();
		System.out.println(hd.priceforfood(103.4, 20.0));
		System.out.println(hd.priceforElectronics(115.0, 22.077));

		QuickDeliverycompany qd=new QuickDeliverycompany();
		System.out.println(qd.priceforfood(155.05, 29.0));
		System.out.println(qd.priceforElectronics(145.07, 27.0));
	}

}
