package edu.unc.comp210.a02mothership;

public abstract class AModule {
    private String name;

    public AModule(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void statusReport(String moduleStatus,boolean isSuccessful){
        System.out.println(name + " is " + moduleStatus);
        if(isSuccessful == true){
            System.out.println("Action Successful");
        }
        else {
            System.out.println(name + " needs immediate attention");
        }
    }



}


