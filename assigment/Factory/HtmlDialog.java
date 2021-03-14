package com.assigment.Factory;

import com.assigment.Singleton;

public class HtmlDialog extends Dialog{

    public static HtmlDialog htmlDialog;
    public static HtmlDialog createHtmlButton(){
        htmlDialog= new HtmlDialog();
        return htmlDialog;
    }
}
