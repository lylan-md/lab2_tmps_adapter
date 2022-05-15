public class Log {
    private String logLevel;
    private String logData;

    public Log(String logLevel, String logData) {
        this.logLevel = logLevel;
        this.logData = logData;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public String getLogData() {
        return logData;
    }
}
