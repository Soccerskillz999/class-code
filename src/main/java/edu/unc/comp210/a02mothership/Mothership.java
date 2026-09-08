package edu.unc.comp210.a02mothership;

import java.util.ArrayList;

public class Mothership {
    private APowerGenerator powerGenerator;
    private ThrusterModule thrusterModule;
    private ExperimentModule experimentModule;
    private ArrayList<AModule> shipModules;

    public Mothership(APowerGenerator powerGenerator, ThrusterModule thrusterModule, ExperimentModule experimentModule){
        this.powerGenerator = powerGenerator;
        this.thrusterModule = thrusterModule;
        this.experimentModule = experimentModule;


        shipModules = new ArrayList<>();
        shipModules.add(powerGenerator);
        shipModules.add(thrusterModule);
        shipModules.add(experimentModule);


    }

    int requestPower(){
        return powerGenerator.generatePower();

    }
    boolean fireThruster(int availablePower){
        return thrusterModule.thrust(availablePower);
    }
    void runExperiment(){
        experimentModule.runExperiment();
    }
    String getExperimentSummary(){
        return experimentModule.getSummery();
    }
    public void printStatusReports(){
        for(int i = 0; i < shipModules.size(); i++) {
            AModule report = shipModules.get(i);
            report.statusReport("Normal", true);
        }
    }
    public Mothership(APowerGenerator powerGenerator, ThrusterModule thrusterModule,
                      ExperimentModule experimentModule, AModule AirLockModule) {
        this(powerGenerator, thrusterModule, experimentModule);

        shipModules.add(AirLockModule);
    }
}
