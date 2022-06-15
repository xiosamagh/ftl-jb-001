package com.company.animals;

 class Animal {
    protected String name;
    protected Integer weight;
    protected Integer currentPosition = 0;
    protected Boolean canFly = false;

    public Animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal() {
        this.canFly = false;
    }

    public void voice() {
        System.out.println("Voice!");
    }

    protected void runForward(Integer length) {
        this.currentPosition = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
    }
}
