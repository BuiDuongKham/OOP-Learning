import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class SimplifiedFormater extends Formatter {
    @Override
    public String format(LogRecord record) {
        System.out.println(record.getMessage());
        return record.getMessage()+"\n";
    }
}
