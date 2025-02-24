import ComponentPackage.*;

public class OfficeComputerBuilder implements ComputerBuilder{

    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.addComponent(new CPU("Intel i5", 250, 4, 3.4));
    }

    @Override
    public void buildGPU() {
        computer.addComponent(new GPU("Intel UHD Graphics 630", 0, 0));
    }

    @Override
    public void buildRAM() {
        computer.addComponent(new RAM("Kingston", 99, 16, "DDR4"));
    }

    @Override
    public void buildStorage() {
        computer.addComponent(new Storage("Seagate Barracuda", 59, 1000, "HDD"));
    }

    @Override
    public void buildOS() {
        computer.addComponent(new OS("Windows 10 Pro", 199));
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }

}
