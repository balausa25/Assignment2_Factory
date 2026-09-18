package com.logistics.abstract_factory;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("🪟 [Windows UI] Button rendered with modern Metro style.");
    }
}