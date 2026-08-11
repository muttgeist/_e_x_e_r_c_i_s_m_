import java.util.regex.*;
public class LogLevels {
    
    public static String message(String logLine) {
        String [] arr = logLine.split(":", 2);
        String message = arr[1].trim();
        return message;
    }

    public static String logLevel(String logLine) {
        String [] arr = logLine.split(":", 2);
        if (arr[0].equals("[ERROR]")) return "error";
        if (arr[0].equals("[WARNING]")) return "warning";
        if (arr[0].equals("[INFO]")) return "info";
        else return "-1";
    }

    public static String reformat(String logLine) {
        String [] arr = logLine.split(":", 2);
        arr[0] = arr[0].toLowerCase();
        arr[0] = arr[0].replace("]",")");
        arr[0] = arr[0].replace("[","(");
        arr[1] = arr[1].trim();
        String m = new String();
        m = m.format("%s %s", arr[1], arr[0]);
        return m;
        
    }
    
}
