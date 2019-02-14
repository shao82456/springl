import bean.BeanOne;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ioc=new AnnotationConfigApplicationContext(AppConfig.class);
        BeanOne beanOne=(BeanOne) ioc.getBean("beanOne");
        beanOne.doSomething();

        ((AnnotationConfigApplicationContext) ioc).close();
    }
}
