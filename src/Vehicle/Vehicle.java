package Vehicle;
//Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck,
// Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type.
// Implement methods for calculating fuel efficiency, distance traveled, and maximum speed
public class Vehicle {
    public String make;
    public String model;
    public int year;
    public String FuelType;

    public Vehicle(String make,String model, int year, String FuelType){
        this.make=make;
        this.model=model;
        this.year=year;
        this.FuelType=FuelType;
    }

    public short fuelEfficiency(int constrYear){
        short fuel_efficiency;
        if(constrYear <= 2000)
            fuel_efficiency=6;
         else if(constrYear>2000 && constrYear<2008)
            fuel_efficiency=12;
        else if(constrYear>=2008 && constrYear<2016)
            fuel_efficiency=18;
        else if(constrYear>=2016 && constrYear<=2024)
            fuel_efficiency=24;
        else
        fuel_efficiency=28;
        return fuel_efficiency;
        }

        public int distTravalCalc(short fuel_efficiency,int year){
        int distance=35000*(2025-year);
        return distance;
        }

    public short maxSpeed(short year){
        return (short) (year/15);
    }
    }


