import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class WorkloadbalancerImpl {

	public List<List<Order>> distributeOrders(int days, List<Order> orders) {
		//
		// Implement Here
		//
		List<List<Order>> response = new ArrayList<>();
		for(int i =0; i < days; i++){
			response.add(new ArrayList<>());
		}

		Map<String, List<Order>> ordersByProcessor = orders.stream().sorted(Comparator.comparingInt(Order::getValue).reversed())
				.collect(Collectors.groupingBy(Order::getProcessor));

		ordersByProcessor.forEach((emp, orderz) -> {
			int ordersPerDay = (orderz.size() / days) + ((orderz.size() % days == 0)?0 : 1);

			for(int i = 0; i < orderz.size(); i++){
				response.get(i/ordersPerDay).add(orderz.get(i));
			}
		});


		return response;
	}

}
