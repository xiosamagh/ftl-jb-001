package com.company.animals;

public class Bird extends Animal implements Flight{
    protected Boolean flyModeActive = false;

//    public final void takeOff() {
//        flyModeActive = true;
//    }
//
//    public final void landing() {
//        flyModeActive = false;
//    }

    public void isTheBirdFlying() {
        System.out.println(
                this.flyModeActive == true ? "Bird flying mode - yes" : "Bird flying mode - no"
        );
    }

    public Bird() {
        super(MoveType.FLY);

    }

    public Boolean getFlyModeActive() {
        return flyModeActive;
    }

    public void setFlyModeActive(Boolean flyModeActive) {
        this.flyModeActive = flyModeActive;
    }

    @Override
    public void takeOff() {
        this.flyModeActive = true;
    }

    @Override
    public void landing() {
        this.flyModeActive = false;
    }
}
