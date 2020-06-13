package deepPrototype;

import deepPrototype.enums.ComputerType;

public class Computer implements Cloneable {

    private ComputerType computerType;
    private Ram ram;
    private Processor processor;
    private int screenSize;

    public Computer(ComputerType computerType, Ram ram, Processor processor, int screenSize) {
        this.computerType = computerType;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
    }

    public Computer clone() {
        return new Computer(this.computerType, this.ram.clone(), this.processor.clone(), this.screenSize);
    }

    public ComputerType getComputerType() {
        return computerType;
    }

    public void setComputerType(ComputerType coputerType) {
        this.computerType = coputerType;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerType=" + computerType +
                ", ram=" + ram.toString() +
                ", processor=" + processor.toString() +
                ", screenSize=" + screenSize +
                '}';
    }
}
