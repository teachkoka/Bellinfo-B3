
public class CloneExample {

	public static void main(String[] args) throws CloneNotSupportedException {
	    Country country1 = new Country();
	    Destinations d1 = new Destinations();
	    d1.setCostOfliving("medium");
	    d1.setDestinationName("Hyderabad");
	    country1.setDestinations(d1);
	    country1.setName("India");
	    Country country2 = (Country) country1.clone();
	    
	    Destinations d2 = new Destinations();
	    d2.setCostOfliving("medium");
	    d2.setDestinationName("SountAfrica");
	    
	    country1.setName("Africa");
	    country1.setDestinations(d2);
	    System.out.println(country2.getName());
	    System.out.println(country2.getDestinations().getDestinationName());
	    
	}

}

class Country implements Cloneable{
	private String name;
	private Destinations destinations;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Destinations getDestinations() {
		return destinations;
	}
	public void setDestinations(Destinations destinations) {
		this.destinations = destinations;
	}
	
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
	
	
}

class Destinations {
	private String destinationName;
	private String costOfliving;
	public String getDestinationName() {
		return destinationName;
	}
	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}
	public String getCostOfliving() {
		return costOfliving;
	}
	public void setCostOfliving(String costOfliving) {
		this.costOfliving = costOfliving;
	}
	

	
	
}


