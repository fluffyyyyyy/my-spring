package org.example;

import org.example.factory.AutowireCapableBeanFactory;
import org.example.factory.BeanFactory;
import org.junit.Test;

public class BeanFactoryTest {

    @Test
    public void test() {
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("org.example.HelloWorldService");
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();


    }
}
