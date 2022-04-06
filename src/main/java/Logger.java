import java.util.Date;

public class Logger {
    protected int num = 1;
    protected Date date = new Date();

    private static Logger instance;

    private Logger() {
            }

    public void log(String msg) {
        System.out.println("[" + date.toString() + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        return instance == null ? instance = new Logger() : instance;
    }
}
