public class Car {
    private String brand;
    private String model;
    private String color;
    private double engineVolume;
    private String country;
    private int year;

    public Car(String brand, String model, String color, double engineVolume, String country, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engineVolume = engineVolume;
        this.country = country;
        this.year = year;
    }
    public String toString() {
        return this.brand+ " "+this.model+", "+this.year+" года выпуска, сборка - "+this.country+", цвет кузова- "+this.color+", объем двигателя - "+this.engineVolume;
    }
}


