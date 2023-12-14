package com.tcoder.patterns.creational.factorymethod;

import com.tcoder.patterns.creational.factorymethod.factory.Dialog;
import com.tcoder.patterns.creational.factorymethod.factory.HtmlDialog;
import com.tcoder.patterns.creational.factorymethod.factory.WindowsDialog;

/**
 * @author tuan.nguyen3
 */
public class DemoFactory {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure(0);
        dialog.renderWindow();
    }

    static void configure(int type){
        if(type == 0) {
            dialog = new WindowsDialog();
            return;
        }
        if(type == 1) {
            dialog = new HtmlDialog();
            return;
        }
        throw new RuntimeException("Unknown OS");

    }
}
