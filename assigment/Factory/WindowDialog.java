package com.assigment.Factory;

public class WindowDialog extends Dialog{
    public static WindowDialog windowDialog;
    public static WindowDialog createWindowButton(){
        windowDialog= new WindowDialog();
        return windowDialog;
    }
}
