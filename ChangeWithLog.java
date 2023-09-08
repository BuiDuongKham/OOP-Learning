import java.util.logging.*;

public class ChangeWithLog {
    private final Logger logger;
    private int x;

    public ChangeWithLog(int x) throws Exception {
        this.x = x;
        this.logger = Logger.getLogger("");
        this.logger.setLevel(Level.ALL);
        this.logger.removeHandler(this.logger.getHandlers()[0]);
        try{
            Handler loggingHandler = new FileHandler("logging-from-class.txt", true);
            loggingHandler.setLevel(Level.ALL);
            this.logger.addHandler(loggingHandler);
            loggingHandler.setFormatter(new SimplifiedFormater());
        } catch (Exception e)
        {
            throw new Exception("something went wrong");
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void addX(){
        this.x += 1;
        this.logger.fine(String.valueOf(this.x));
        System.out.println(this.logger.getLevel());
    }

    public void subX(){
        this.x -= 1;
        this.logger.info(String.valueOf(this.x));
        System.out.println(this.logger.getLevel());
    }
}
