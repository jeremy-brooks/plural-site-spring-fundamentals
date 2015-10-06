import com.spring.fundamentals.service.CustomerService;
import com.spring.fundamentals.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * Created by jbrooks on 06/10/2015.
 */
@Configurable
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerService(){
        return new CustomerServiceImpl();
    }

}
