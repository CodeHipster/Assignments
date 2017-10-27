public class Main {
    public static void main(String[] args) throws Throwable {
        VirtualCPUTester tester = new VirtualCPUTester();

        boolean b = tester.performTest(0);
        boolean b1 = tester.performTest(1);
        boolean b2 = tester.performTest(2);
        boolean b3 = tester.performTest(3);
    }

}
