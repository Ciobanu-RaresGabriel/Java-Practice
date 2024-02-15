package Vehicle;

public class Car extends Vehicle{
    public Car(String make,String model, int year,String FuelType){
        super(make, model, year, FuelType);
    }

    public short fuelEfficiency(int constrYear){
        short fuel_efficiency;
        if(constrYear <= 2000)
            fuel_efficiency=3;
        else if(constrYear>2000 && constrYear<2008)
            fuel_efficiency=5;
        else if(constrYear>=2008 && constrYear<2016)
            fuel_efficiency=8;
        else if(constrYear>=2016 && constrYear<=2024)
            fuel_efficiency=9;
        else
            fuel_efficiency=10;
        return fuel_efficiency;
    }

    public int distTravalCalc(short fuel_efficiency,int year){
        int distance=45000*(2025-year);
        return distance;
    }

    public short maxSpeed(short year){
        return (short) (year/8);
    }
}
