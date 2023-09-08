public class Test {
    public static void main(String[] args) throws Exception {
        ChangeWithLog logger = new ChangeWithLog(1);
        logger.addX();
        logger.subX();
    }
}
