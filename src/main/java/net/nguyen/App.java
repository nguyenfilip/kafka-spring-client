package net.nguyen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(KafkaConfig.class);

        Thread.sleep(10000);
    }
}
