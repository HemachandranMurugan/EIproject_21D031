package CDP_useCase1;

// Test
public class SingletonPatternDemo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First log");
        logger2.log("Second log");

        System.out.println(logger1 == logger2); // Should print true
    }
}
