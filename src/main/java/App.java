import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean0 = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld bean1 = applicationContext.getBean("helloworld", HelloWorld.class);

        Cat cat0 = applicationContext.getBean("cat", Cat.class);
        Cat cat1 = applicationContext.getBean("cat", Cat.class);

        System.out.println("   equals:");
        System.out.println("1. bean & bean1 = " + (bean0 == bean1));
        System.out.println("2. cat & cat1 = " + (cat0 == cat1));

//      System.out.println(cat0.getMessage());
    }
}
