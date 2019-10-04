import com.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        Test test = context.getBean(Test.class);
        test.printGmail();
    }

}
