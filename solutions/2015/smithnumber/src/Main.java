public class Main {
    public static void main(String[] args) throws Throwable {
        SmithNumberTester tester = new SmithNumberTester();

        boolean b = tester.performTest(0);
        boolean b1 = tester.performTest(1);
        boolean b2 = tester.performTest(2);
    }
}
