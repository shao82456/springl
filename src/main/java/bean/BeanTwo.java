package bean;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BeanTwo {
    public void doSomething() {
        System.out.println("Inside do doSomething() method of BeanTwo");
    }
}
