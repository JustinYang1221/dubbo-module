import com.consumer.service.impl.ConsumerApplication;
import com.consumer.service.impl.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: justin
 * @date: 2022/9/11
 */
@ExtendWith(SpringExtension.class)
//@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsumerApplication.class)
public class ConsumerServerApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void buyTicketTest(){
        for(int i=0;i< 10; i++){
            userService.buyTicket();
        }
    }
}
