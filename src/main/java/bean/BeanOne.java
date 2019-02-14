package bean;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BeanOne {
    @Resource
    private BeanTwo beanTwo;

    public void doSomething(){
        System.out.println("Inside do doSomething() method of BeanOne");
        beanTwo.doSomething();
    }
}
