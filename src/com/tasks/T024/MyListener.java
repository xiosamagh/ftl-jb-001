package com.tasks.T024;

public class MyListener implements MyStringBuilderListener{

    @Override
    public void onDiffer(MyStringBuilder stringBuilder) {
        System.out.println("Произошли изменения: " + stringBuilder.toString());
    }
}
