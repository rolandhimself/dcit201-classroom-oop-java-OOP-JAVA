package src.main.java.org.example;
import src.main.java.org.example.*;

public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;
    //constructors
    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
        }


    //abstract methods
    public abstract boolean isAvailableForRental();

    //getters and setters
    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    //getter and setter for model
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    //getter and setter for baseRentalRate
    public double getBaseRentalRate() {
        return baseRentalRate;
    }
    public void setBaseRentalRate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
    }
    //getter and setter for availability
    public boolean getIsAvailable() {
        return isAvailable;
    }
    protected void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public abstract double calculateRentalCost(int days);

    public abstract void rent(Customer customer, int days);

    public abstract void returnVehicle();

    //                   C  A  R
    public abstract static class Car extends Vehicle {
        private String CarType;   //specific feature i.e.comfort,economy,business

        public Car(String vehicleId, String model, double baseRentalRate, String CarType) {
            super(vehicleId, model, baseRentalRate);
            this.CarType = CarType;
        }
        //getter and setter for special features
        public String getCarType() {
            return CarType;
        }
        public void setCarType(String CarType) {
            this.CarType = CarType;
        }
        public boolean isAvailableForRental() {
            return (this.getIsAvailable());
        }
        @Override
        public double calculateRentalCost(int days){
            return (this.getBaseRentalRate()*days);
        }
        @Override
        public void rent(Customer customer, int days) {
            if (this.getIsAvailable()) {
                System.out.println("Vehicle booked by " + Customer.getName() + " for " + days + " days.");
            }
            else {
                System.out.println("Vehicle already booked.");
            }
        }
        @Override
        public void returnVehicle() {
            System.out.println("Vehicle returned.");
        }

    }
    //            M  O  T  O  R  C  Y  C  L  E
    public abstract static class Motorcycle extends Vehicle {
        private String MotorcycleType; //specific feature i.e.quad bike,jungle,escort bike

        public Motorcycle(String vehicleId, String model, double baseRentalRate, String MotorcycleType) {
            super(vehicleId, model, baseRentalRate);
            this.MotorcycleType = MotorcycleType;
        }
        //getter and setter for special features
        public String getMotorcycleType() {
            return MotorcycleType;
        }
        public void setMotorcycleType(String MotorcycleType) {
            this.MotorcycleType = MotorcycleType;
        }
        public boolean isAvailableForRental() {
            return (this.getIsAvailable());
        }
        @Override
        public double calculateRentalCost(int days){
            return (this.getBaseRentalRate()*(days/2)); //unique calculation on 12 hour basis
        }
        @Override
        public void rent(Customer customer, int days) {
            if (this.getIsAvailable()) {
                System.out.println("MotorCycle booked by " + Customer.getName() + " for " + days + " days.");
            }
            else {
                System.out.println("MotorCycle already booked.");
            }
        }
        @Override
        public void returnVehicle() {
            System.out.println("MotorCycle returned.");
        }
    }
    //                  T  R  U  C  K
    public abstract static class Truck extends Vehicle {
        private String TruckType; //specific truck type i.e.long vehicle,box truck,flatbed

        public Truck(String vehicleId, String model, double baseRentalRate, String TruckType) {
            super(vehicleId, model, baseRentalRate);
            this.TruckType = TruckType;
        }
        //getter and setter for specific feature
        public String getTruckType() {
            return TruckType;
        }
        public void setTruckType(String TruckType) {
            this.TruckType = TruckType;
        }
        public boolean isAvailableForRental() {
            return (this.getIsAvailable());
        }
        @Override
        public double calculateRentalCost(int days){
            return (this.getBaseRentalRate()*days)*3;
        }
        @Override
        public void rent(Customer customer, int days) {
            if (this.getIsAvailable()) {
                System.out.println("Truck booked by " + Customer.getName() + " for " + days + " days.");
            }
            else {
                System.out.println("Truck already booked.");
            }
        }
        @Override
        public void returnVehicle() {
            System.out.println("Truck returned.");
        }
    }
}
