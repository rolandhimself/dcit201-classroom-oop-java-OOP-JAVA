package src.main.java.org.example;
import src.main.java.org.example.*;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int age;
    private static String name;
    private String licenseNumber;
    public static List<RentalTransaction> rentalTransactions;

    public Customer(int age, String name, String licenseNumber) {
        this.age = age;
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rentalTransactions = new ArrayList<>();
    }
    public void addRentalTransaction(RentalTransaction transaction) {
        rentalTransactions.add(transaction);
    }
    public boolean isEligible(int age){
        return age >= 18;
    }
    //getters and setters
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLicenseNumber() {
        return licenseNumber;
    }
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    public List<RentalTransaction> getRentalTransactions() {
        return rentalTransactions;
    }
    public void setRentalTransactions(List<RentalTransaction> rentalTransactions) {
        this.rentalTransactions = rentalTransactions;
    }
}
