package edu.unc.comp210.a02mothership;


public class Main{
    public static void main (String[] args) {
        double[] params = {1.3, 3.3, 6.7};
        APowerGenerator generator = new SolarGenerator();
        ThrusterModule thruster = new ThrusterModule(13,true);
        ExperimentModule experiment = new ExperimentModule("Test", params);
        Mothership ship = new Mothership(generator, thruster, experiment);
        int power = ship.requestPower();
        boolean fired = ship.fireThruster(power);




        System.out.println("Power Requested :  " + power );
        System.out.println("Thruster Fired : " + fired);
        System.out.println(ship.getExperimentSummary());
        ship.printStatusReports();




    }
}
