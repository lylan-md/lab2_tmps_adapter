public class Main {
    public static void main(String[] args) {
        AppLoggerImpl appLogger = new AppLoggerImpl();

        Log log = new Log("INFO", "Test log!");
        appLogger.logObj(log);
    }
}
