package com.assigment.Factory;

public class WindowButton implements Button{
    @Override
    public String render(int a, int b) {
        return "Render WindowButton";
    }

    @Override
    public String onClick(int f) {
        return "Click WindowButton";
    }
}
