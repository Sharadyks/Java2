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

//    @Override
//    public String toString() {
//        return "Bike{" +
//                "model='" + model + '\'' +
//                ", company='" + company + '\'' +
//                ", yearOfManufacturing=" + yearOfManufacturing +
//                ", vehicleNumber='" + vehicleNumber + '\'' +
//                ", cc=" + cc +
//                '}';
//    }
//    Above, during every concatenation of strings, every new string object is created in the heap which makes the use of memory exponentially increase.
//    For solving this, we can use Stringbuild in toString method. Below is the toString method using Stringbuilder class.


    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Car{ ");
        info.append(" model: '").append(model).append('\''); // Here we can do chaining because append method return the object itself.
        info.append(" company: '").append(company).append('\'');
        info.append(" yearOfManufacturing: '").append(yearOfManufacturing).append('\'');
        info.append(" vehicleNumber:").append(vehicleNumber);
        info.append(" cc: ").append(cc).append(" }");
        return info.toString();
    }

    public static void main(String[] args) {
        Bike bike = new Bike("Pulsar","Bajaj",2026,"HR51CK5102",150);
        System.out.println(bike.toString());

    }
}
