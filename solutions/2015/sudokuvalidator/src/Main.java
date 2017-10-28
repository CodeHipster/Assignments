public class Main {
    public static void main(String[] args) throws Throwable {
        SudokuTester tester = new SudokuTester();

        boolean b = tester.performTest(0);
        boolean b1 = tester.performTest(1);
        boolean b2 = tester.performTest(2);
        boolean b3 = tester.performTest(3);
        boolean b4 = tester.performTest(4);
        boolean b5 = tester.performTest(5);
        boolean b6 = tester.performTest(6);
        boolean b7 = tester.performTest(7);
    }

}
