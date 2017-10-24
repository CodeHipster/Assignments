import java.util.*;
import java.util.stream.Collectors;


public class WorkLoadBalancer {

    public List<List<Order>> distributeOrders(int days, List<Order> orders) {
        //
        // Implement Here
        //

        //first create 2 lists for each processor
        //sort on value
        //divide over each day

        Map<String, List<Order>> orderPerProcessor = orders.stream().collect(Collectors.groupingBy(Order::getProcessor));

        List<List<Order>> daysWithOrders = new ArrayList<>();
        //initialize lists
        for (int i = 0; i < days; i++) {
            daysWithOrders.add(new ArrayList<>());
        }

        orderPerProcessor.forEach(
                (processor, orderz) -> {
                    int nrOfOrdersPerDay = orderz.size() / days;
                    nrOfOrdersPerDay += (orderz.size() % days == 0) ? 0 : 1;

                    orderz.sort(Comparator.comparingInt(Order::getValue).reversed());

                    for (int i = 0; i < orderz.size(); i++) {
                        List<Order> ordersForTheDay = daysWithOrders.get(i / nrOfOrdersPerDay);
                        ordersForTheDay.add(orderz.get(i));
                    }
                }
        );

        return daysWithOrders;
    }
}