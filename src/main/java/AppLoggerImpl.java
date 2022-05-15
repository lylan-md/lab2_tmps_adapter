import com.google.gson.JsonObject;

public class AppLoggerImpl extends GenericJsonLogger implements AppLogger {
    @Override
    public void logObj(Log log) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("logLevel", log.getLogLevel());
        jsonObject.addProperty("logData", log.getLogData());
        super.log(jsonObject.toString());
    }
}
