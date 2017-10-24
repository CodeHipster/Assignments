public class main {

    public static void main(String[] args) throws Throwable{
        WorkloadbalancerTester workloadbalancerTester = new WorkloadbalancerTester();

        boolean a = workloadbalancerTester.performTest(0);
        boolean b = workloadbalancerTester.performTest(1);
        boolean c = workloadbalancerTester.performTest(2);
    }
}
