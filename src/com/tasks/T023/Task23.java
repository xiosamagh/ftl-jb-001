package com.tasks.T023;

import java.util.Stack;

public class Task23 {

    public static void main(String[] args) {
        MyStringBuilder str = new MyStringBuilder();

        System.out.println("Начальная строка: ");
        str.append("Добро пожаловать в Java");
        System.out.println(str);


        str.undo();


    }


}

class MyStringBuilder {

    private class DeleteActivity implements Activity {
        private int size;

        public DeleteActivity(int size) {
            this.size = size;
        }

        public void undo(){
            stringBuilder.delete(stringBuilder.length() - size, stringBuilder.length());
        }
    }
    public Stack<Activity> activities = new Stack<>();
    private StringBuilder stringBuilder;


    public MyStringBuilder() {
        stringBuilder = new StringBuilder();
    }


    public MyStringBuilder append(String str) {
        stringBuilder.append(str);

        Activity activity = new Activity(){
            public void undo() {
                stringBuilder.delete(
                        stringBuilder.length() - str.length() -1,
                        stringBuilder.length());
            }
        };

        activities.add(activity);
        return this;
    }

    public MyStringBuilder appendCodePoint(int codePoint) {
        int length = stringBuilder.length();
        stringBuilder.appendCodePoint(codePoint);
        activities.add(new DeleteActivity(stringBuilder.length() - length));
        return this;
    }

    public MyStringBuilder insert(int offset, String str) {
        stringBuilder.insert(offset, str);
        activities.add(() -> stringBuilder.delete(offset, str.length()));
        return this;
    }

    public MyStringBuilder delete(int start, int end) {
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);
        activities.add(() -> stringBuilder.insert(start, deleted));
        return this;
    }

    public MyStringBuilder reverse() {
        stringBuilder.reverse();

        Activity activity = new Activity(){
            public void undo() {
                stringBuilder.reverse();
            }
        };
        activities.add(activity);
        return this;
    }

    public MyStringBuilder deleteCharAt(int index) {
        char deleted = stringBuilder.charAt(index);
        stringBuilder.deleteCharAt(index);
        activities.add(() -> stringBuilder.insert(index, deleted));
        return this;
    }

    public MyStringBuilder replace(int start, int end, String str) {
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.replace(start, end, str);
        activities.add(() -> stringBuilder.replace(start, end, deleted));
        return this;
    }


    public void undo(){
        if(!activities.isEmpty()){
            activities.pop().undo();
        }
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" +
                "stringBuilder=" + stringBuilder +
                ", actions=" + activities +
                '}';
    }
}
