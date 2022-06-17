package com.tasks.T024;

public class Task24 {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();

        myStringBuilder.setMyStringBuilderListener(new MyListener());

        myStringBuilder.append("Привет");
        myStringBuilder.append(" ");
        myStringBuilder.append("Java");
        myStringBuilder.append("!");
        myStringBuilder.delete(5,7);
        myStringBuilder.replace(1,2,"VOLGA");
    }


}
