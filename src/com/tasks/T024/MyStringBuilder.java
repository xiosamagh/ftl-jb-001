package com.tasks.T024;

public class MyStringBuilder {
    private  MyStringBuilderListener myStringBuilderListener;

    private StringBuilder stringBuilder;


    public void setMyStringBuilderListener(MyStringBuilderListener myStringBuilderListener) {
        this.myStringBuilderListener = myStringBuilderListener;
    }

    public MyStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    private void notifyMyStringBuilderListener(){
        if(myStringBuilderListener != null){
            myStringBuilderListener.onDiffer(this);
        }
    }

    public MyStringBuilder append(Object obj) {
        stringBuilder.append(obj);
        notifyMyStringBuilderListener();
        return this;
    }

    public MyStringBuilder delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyMyStringBuilderListener();
        return this;
    }

    public MyStringBuilder replace(int start, int end, String str) {
        stringBuilder.replace(start, end, str);
        notifyMyStringBuilderListener();
        return this;
    }

    public MyStringBuilder insert(int index, char[] str, int offset, int len) {
        stringBuilder.insert(index, str, offset, len);
        notifyMyStringBuilderListener();
        return this;
    }


    @Override
    public String toString() {
        return "MyStringBuilder{" +

                "stringBuilder=" + stringBuilder +
                '}';
    }
}
