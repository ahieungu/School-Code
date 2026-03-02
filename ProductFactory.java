package Congo.Products;

import Congo.Enums.HealthLocale;
import Congo.Enums.PortTypes;
import Congo.Enums.ProductTypes;
import Congo.Enums.Sizes;

public class ProductFactory {

	private ProductFactory(){}

	public static Product makeProduct(String dataString){
		String[] data = dataString.split("\t");
		try{
			switch(ProductTypes.valueOf(data[0].toUpperCase())){
				case TECHNOLOGY:
					return new Technology(
						data[1],
						Double.parseDouble(data[2]),
						Integer.parseInt(data[3]),
						PortTypes.valueOf(data[4]),
						Integer.parseInt(data[5])
					);
				case FOOD:
					return new Food(
						data[1],
						Double.parseDouble(data[2]),
						data[3].split(","),
						Integer.parseInt(data[4]),
						Integer.parseInt(data[5])
					);
				case HYGIENE:
					return new Hygiene(
						data[1],
						Double.parseDouble(data[2]),
						HealthLocale.valueOf(data[3]),
						Integer.parseInt(data[4]),
						data[5]
					);
					// TODO - add support for making clothing objects
				case CLOTHING:
					return new Clothing(
						data[1],
						Double.parseDouble(data[2]),
						Sizes.valueOf(data[3]),
						data[4]
					);
			}
		}
		catch(IllegalArgumentException e){
			System.out.printf("Bad product data: %s%n", dataString);
		}
		return null;
	}

}
