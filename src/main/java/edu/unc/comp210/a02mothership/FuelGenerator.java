package edu.unc.comp210.a02mothership;

public abstract class FuelGenerator extends AModule {
    private int fuel;

    public FuelGenerator(int fuel){
        super("fuelGenerator");
        this.fuel=fuel;
    }

    @Override
    public void statusReport(String moduleStatus, boolean isSuccessful) {
        super.statusReport(moduleStatus, isSuccessful);
        System.out.println("FuelGenerator: " + fuel + " units of fuel remaining.");

    }
    public int generatePower(){
        if(fuel >=10){
            fuel = fuel - 10;
            return 10;
        }
        else{
            int leftoverfuel = fuel;
            fuel = 0;
            return leftoverfuel;
        }

    }
}
