public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Application started");
        logger.changeFile("new_log.txt");
        logger.log("Simulation started");
        logger.log("Processing data...");
        logger.log("Simulation finished");
    }
}
