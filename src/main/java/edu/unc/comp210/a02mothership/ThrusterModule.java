package edu.unc.comp210.a02mothership;

public class ThrusterModule extends AModule {
    private int fuel;
    private boolean lastFired;

    public ThrusterModule(int fuel, boolean lastFired){

        super("thrusterModule");
        this.fuel= 100;
        this.lastFired= false;

    }

    @Override
    public void statusReport(String moduleStatus, boolean isSuccessful) {
        super.statusReport(moduleStatus, isSuccessful);
        String fired;
        if(lastFired == true){
            fired = "Yes";
        }
        else{
            fired = "No";
        }
        System.out.println("ThrusterModule: "+ fuel + " unit of fuel remaining. Last fired: " + fired );
    }
    public boolean thrust(int availablePower){
        String fired;
        if(fuel > 4 && availablePower> 4){
            fuel = fuel - 5;
            lastFired = true;
            System.out.println("5 fuel used for propulsion maneuver.");
        }
        else{
            lastFired = false;

            System.out.println("ThrusterModule: Not enough power or fuel to fire.");

        }
        return lastFired;
    }

}
