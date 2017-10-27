public class Main {
    public static void main(String[] args) throws Throwable {
        WorkloadbalancerTester workloadbalancerTester = new WorkloadbalancerTester();

        boolean b = workloadbalancerTester.performTest(0);
        boolean b1 = workloadbalancerTester.performTest(1);
        boolean b2 = workloadbalancerTester.performTest(2);
    }

}
