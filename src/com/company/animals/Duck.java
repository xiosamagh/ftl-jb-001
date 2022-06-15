package com.company.animals;

public class Duck extends Bird{
    public Duck() {}

    @Override
    public void voice() {
        System.out.println("кря кря");
    }

    public void showSpeed() {
        if (this.flyModeActive == true) {
            System.out.println("скорость утки = 40");

        }
        else {
            System.out.println("скорость утки = 4");
        }
    }
}
