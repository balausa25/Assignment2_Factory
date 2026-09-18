package com.logistics.factory_method;

public abstract class Abstract {
    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }

    public abstract Transport createTransport();
}