import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DukemailValidatorImpl implements DukemailValidator{

	@Override
	public boolean isValid(String dukemailAddress) {
		// TODO Implement validation

		//String regex = "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]*(\\.+[a-zA-Z0-9]*\\.dukemail|\\.dukemail)$";
		String regex = "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]*\\.dukemail$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(dukemailAddress);

//		int count = 0;
//		while(matcher.find()) {
//			count++;
//			System.out.println("Match number "+count);
//			System.out.println("start(): "+matcher.start());
//			System.out.println("end(): "+matcher.end());
//		}


		boolean matches = matcher.matches();
		return matches;

	}
	
	
}