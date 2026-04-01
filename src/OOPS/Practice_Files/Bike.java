package OOPS.Practice_Files;

public class Bike {
    String model;
    String company;
    int yearOfManufacturing;
    String vehicleNumber;
    int cc;

    public Bike(String model, String company, int yearOfManufacturing, String vehicleNumber, int cc) {
        this.model = model;
        this.company = company;
        this.yearOfManufacturing = yearOfManufacturing;
        this.vehicleNumber = vehicleNumber;
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Bike{" +  // During every concatenation of strings, every new string object is created in the heap which makes the use of memory exponentially increase.
                "model='" + model + '\'' +
                ", company='" + company + '\'' +
                ", yearOfManufacturing=" + yearOfManufacturing +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", cc=" + cc +
                '}';
    }

    public static void main(String[] args) {
        Bike bike = new Bike("Pulsar","Bajaj",2026,"HR51CK5102",150);
        System.out.println(bike.toString());

    }
}
