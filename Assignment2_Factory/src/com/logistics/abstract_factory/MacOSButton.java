package com.logistics.abstract_factory;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("🍎 [MacOS UI] Button rendered with rounded Aqua style.");
    }
}