public class Main {
    public static void main(String[] args) {


        ComputerBuilder builder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        director.constructPC();
        Computer computer = builder.getComputer();
        System.out.println(computer);

        ComputerBuilder builder2 = new OfficeComputerBuilder();
        ComputerDirector director2 = new ComputerDirector(builder2);
        director2.constructPC();
        Computer computer2 = builder2.getComputer();
        System.out.println(computer2);

    }
}
