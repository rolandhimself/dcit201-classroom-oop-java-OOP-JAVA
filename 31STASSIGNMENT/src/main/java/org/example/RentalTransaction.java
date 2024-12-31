package src.main.java.org.example;
import src.main.java.org.example.*;

public class RentalTransaction {
    public Customer customer;
    public Vehicle vehicle;
    public int rentalDays;

    //constructor
    public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
    }

    //getters and setters
    public Customer getCustomer() {
        return customer;
    }
    public Customer setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public Vehicle setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public int getRentalDays() {
        return rentalDays;
    }
    public int setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    //cost calculation method
    public double calculateRentalCost(int days){
        return Vehicle.calculateRentalCost(days);
    }

    public interface Rentable{
        void rent(Customer customer, int days);
        void returnVehicle();
    }
}
