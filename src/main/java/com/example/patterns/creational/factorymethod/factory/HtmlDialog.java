package com.example.patterns.creational.factorymethod.factory;

import com.example.patterns.creational.factorymethod.buttons.Button;
import com.example.patterns.creational.factorymethod.buttons.HtmlButton;

/**
 * @author tuan.nguyen3
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
