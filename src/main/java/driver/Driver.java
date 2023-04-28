package driver;

import transport.Transport;

public class Driver {

    private String fio;
    private Transport transport;

    public Driver(String fio, Transport transport) {
        this.fio = fio;
        this.transport = transport;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Transport getTranspport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Водитель: " + fio + " Автомобиль: " + transport;
    }
}
