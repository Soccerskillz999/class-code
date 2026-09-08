package edu.unc.comp210.a02mothership;

public abstract class AirLockModule extends AModule{
    private int people;

    public AirLockModule(int people){
        super("Airlockmodule");
        this.people = people;
    }
}
