package com.tcoder.patterns.creational.abstractfactory.checkbox;

/**
 * @author tuan.nguyen3
 */
public class MacOSCheckBox implements ICheckbox{
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
