//Kanemoto
//11.24.26
//the car class for my car game

public class Car {
	private int id;
	private String make;
	private String model;
	private double milesPerGallon;

	public Car(int id, String make, String model, double milesPerGallon) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.milesPerGallon = milesPerGallon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getMilesPerGallon() {
		return milesPerGallon;
	}

	public void setMilesPerGallon(double milesPerGallon) {
		this.milesPerGallon = milesPerGallon;
	}

    //the toString method is used to return a string representation of the object

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id + ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", milesPerGallon=" + milesPerGallon +
                '}';    
}
