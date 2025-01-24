import java.io.*;


public class Logger {

    private static Logger instance;
    private File file = new File("log.txt");


    private Logger() {
        ensureLogDirectoryExists();
        try {
            if (file.createNewFile()) {
                System.out.println("Log file created: " + file.getPath());
            } else {
                System.out.println("Log file found: " + file.getPath());
            }
        } catch (IOException e) {
            e.printStackTrace();
            }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void changeFile(String path) {
        try {
            file = new File(path);
            if (file.createNewFile()) {
                System.out.println("Log file created: " + file.getPath());
            } else {
                System.out.println("Log file found: " + file.getPath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void log(String message) {
        try (Writer writer = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(message);
            bufferedWriter.newLine();
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void ensureLogDirectoryExists() {
        File logDir = new File("logs");
        if (!logDir.exists()) {
            if (logDir.mkdirs()) {
                System.out.println("Log directory created: " + logDir.getAbsolutePath());
            } else {
                System.err.println("Failed to create log directory");
            }
        }
    }
}
