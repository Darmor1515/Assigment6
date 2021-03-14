package com.assigment.Factory;

public class HtmlButton implements Button{
    @Override
    public String render(int a, int b) {
        return "Render HtmlButton";
    }

    @Override
    public String onClick(int f) {
        return "Click HtmlButton";
    }
}
