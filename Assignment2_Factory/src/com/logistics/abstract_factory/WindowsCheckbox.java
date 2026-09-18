package com.logistics.abstract_factory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("🪟 [Windows UI] Checkbox rendered with square style.");
    }
}