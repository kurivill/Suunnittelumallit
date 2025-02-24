import ComponentPackage.*;

public class GamingComputerBuilder implements ComputerBuilder{

    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.addComponent(new CPU("Intel i9-9900K", 500, 8, 3.6));
    }

    @Override
    public void buildGPU() {
        computer.addComponent(new GPU("Nvidia RTX 4080", 16, 799));
    }

    @Override
    public void buildRAM() {
        computer.addComponent(new RAM("HyperX Fury", 289, 64, "DDR5"));
    }

    @Override
    public void buildStorage() {
        computer.addComponent(new Storage("Samsung 970 EVO", 199, 1000, "SSD"));
    }

    @Override
    public void buildOS() {
        computer.addComponent(new OS("Windows 10 Home", 119));
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
