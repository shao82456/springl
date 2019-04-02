package entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanTwo implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

    //2
    @Value("bean2")
    private String nickname;
    private String beanname;
    private ApplicationContext ioc;

    //4
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ioc=applicationContext;
    }

    //1
    public void doSomething() {
        System.out.println("Inside do doSomething() method of BeanTwo");
    }

    //3
    @Override
    public void setBeanName(String s) {
        this.beanname=s;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("begin destory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("process done/properties set down");
    }
}
