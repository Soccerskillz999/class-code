package edu.unc.comp210.a02mothership;

public class ExperimentModule extends AModule{
    private String experimentName;
    private double[] parameters;
    double result;
    boolean hasRun;
    public void runExperiment(){
        for (int i = 1; i <= parameters.length; i++) {
            result=i*Math.random();
            hasRun=true;

        }
    }
    public String getSummery(){
        if(hasRun=true){

        }
    }
}
