import entity.BeanOne;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ioc=new AnnotationConfigApplicationContext(AppConfig.class);
        BeanOne beanOne=(BeanOne) ioc.getBean("beanOne");
        beanOne.doSomething();
//        ((AnnotationConfigApplicationContext) ioc).close();
        System.out.println(beanOne.getMessage());
        ((AnnotationConfigApplicationContext) ioc).close();
    }
}
