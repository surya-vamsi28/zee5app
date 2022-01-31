import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.zee.zee5app.dto.ROLE;
import com.zee.zee5app.dto.Register;
import com.zee.zee5app.dto.Series;
import com.zee.zee5app.dto.Subscription;
import com.zee.zee5app.exception.IdNotFoundException;
import com.zee.zee5app.exception.InvalidAmountException;
import com.zee.zee5app.exception.InvalidEmailException;
import com.zee.zee5app.exception.InvalidIdLengthException;
import com.zee.zee5app.exception.InvalidNameException;
import com.zee.zee5app.exception.InvalidPasswordException;
import com.zee.zee5app.exception.InvalidTypeException;
import com.zee.zee5app.repository.impl.LoginRepositoryImpl;
import com.zee.zee5app.repository.impl.SeriesRepositoryImpl;
import com.zee.zee5app.repository.impl.UserRepositoryImpl;
import com.zee.zee5app.service.LoginService;
import com.zee.zee5app.service.SeriesService;
import com.zee.zee5app.service.SubscriptionService;
import com.zee.zee5app.service.UserService;
import com.zee.zee5app.service.impl.LoginServiceImpl;
import com.zee.zee5app.service.impl.SeriesServiceImpl;
import com.zee.zee5app.service.impl.SubscriptionServiceImpl;
import com.zee.zee5app.service.impl.UserServiceImpl;

public class Main {

	public static void main(String[] args) throws InvalidNameException, InvalidIdLengthException, InvalidEmailException, InvalidPasswordException, IOException {
		// TODO Auto-generated method stub
//		UserService service = UserServiceImpl.getInstance();\
		SubscriptionService subservice = SubscriptionServiceImpl.getInstance();
		LoginService loginservice = LoginServiceImpl.getInstance();
		SeriesService serservice = SeriesServiceImpl.getInstance();
		
//		
//		Optional<List<Register>> optional = service.getAllUserDetails();
//		
//		if(optional.isEmpty()) {
//			System.out.println("there re no records");
//		}
//		else {
//			optional.get().forEach(e->System.out.println(e));
//		}
		 
//		Register register = new Register("ab00008","surya vamsi varma","kalidindi","suryavamsi2 @gmail.com","123456789");
//		register.setContactNumber(new BigDecimal("9441612222"));
//		
//		String result = service.addUser(register);
//		System.out.println(result);
//		

//		try {
//			String result1 = service.deleteUserById("ab00002");
//			System.out.println(result1);
//		} catch (IdNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		String res = loginservice.changeRole("suryavamsii28@gmail.com", ROLE.ROLE_ADMIN);
//		System.out.println(res);
		
		Subscription subs = new Subscription();
		
		
//		
//		try {
//			subs.setStatus("ACTIVE");
//			subs.setSub_id("ab00010");
//			subs.setSub_amount(150);
//			subs.setSub_autorenewal("True");
//			subs.setSub_dop(null);
//		} catch (InvalidAmountException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		Optional<Subscription> optional = null;
//		try {
//			optional = subservice.getSubscriptionById("sc00001");
//		} catch (IdNotFoundException | InvalidIdLengthException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InvalidAmountException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InvalidTypeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if(optional.isPresent()) {
//			System.out.println("getUserById" + optional.get());
//		}
//		else {
//			System.out.println("false");}
			
			
			
//			
//			Optional<List<Subscription>> optional1;
//			try {
//				optional1 = subservice.getAllSubscriptionsDetails();
//				if(optional1.isEmpty()) {
//					System.out.println("there re no records");
//				}
//				else {
//					optional1.get().forEach(e->System.out.println(e));
//				}
//			} catch (InvalidIdLengthException | InvalidAmountException | InvalidTypeException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
			
			
//			try {
//				Subscription[] subcription1 = subservice.getAllSubscriptions();
//				
//				for (Subscription subscription : subcription1) {
//					System.out.println(subscription);
//				}
//			} catch (InvalidIdLengthException | InvalidAmountException | InvalidTypeException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			String res = subservice.deleteSubscriptionById("sv00003");
//			System.out.println(res);
//		Optional<Register> optional = null;
//		try {
//			optional = service.getUserById("ab00002");
//		} catch (IdNotFoundException | InvalidPasswordException | InvalidIdLengthException | InvalidNameException
//				| InvalidEmailException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if(optional.isPresent()) {
//			System.out.println("getUserById" + optional.get());
//		}
//		else {
//			
//		
//	}	
//		Optional<Series> optional = null;
//		try {
//			optional = serservice.getSeriesById("ser00001");
//		} catch (IdNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if(optional.isPresent()) {
//			System.out.println("getSeriesById" + optional.get());
//		}else {
//			System.out.println("fail");
//		}
//		
//		try {
//			String res = serservice.deleteSeriesById("ser00001");
//			System.out.println(res);
//		} catch (IdNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
		
		
		
	}


