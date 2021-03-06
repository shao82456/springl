package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanOne {

    @Autowired
    private BeanTwo beanTwo;

    @Value("m")
    private String  message;

    public void doSomething(){
        System.out.println("Inside do doSomething() method of BeanOne");
        beanTwo.doSomething();
    }

    public String getMessage() {
        return message;
    }
}
