package com.logistics.abstract_factory;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("🍎 [MacOS UI] Checkbox rendered with smooth circle style.");
    }
}
