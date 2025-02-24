public class ComputerDirector {

    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder builder) {
        this.computerBuilder = builder;
    }

    public void constructPC() {
        computerBuilder.buildCPU();
        computerBuilder.buildGPU();
        computerBuilder.buildRAM();
        computerBuilder.buildStorage();
        computerBuilder.buildOS();
    }
}
