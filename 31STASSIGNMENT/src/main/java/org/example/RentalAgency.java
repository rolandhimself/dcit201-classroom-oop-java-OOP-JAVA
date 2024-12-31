package src.main.java.org.example;
import src.main.java.org.example.*;

public class RentalAgency {
    private Vehicle vehicle;
    public int rentalDays;
    private double rentalCost;

    public interface Rentable{
        void rent(Customer customer, int days);
        void returnVehicle();
    }
}
