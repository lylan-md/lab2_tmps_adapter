public class GenericJsonLogger {
    public void log(String json) {
        System.out.println(java.time.LocalDateTime.now() + " | " + json);
    }
}
