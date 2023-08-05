package com.tcoder.patterns.creational.factorymethod.factory;

import com.tcoder.patterns.creational.factorymethod.buttons.Button;
import com.tcoder.patterns.creational.factorymethod.buttons.HtmlButton;

/**
 * @author tuan.nguyen3
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
