package com.stackroute;

import com.stackroute.firsttask.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac1 = new ClassPathXmlApplicationContext("beans.xml");
        Movie m = ac1.getBean("movie", Movie.class);
        m.display();
        Resource resource = new ClassPathResource("beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Movie m1 = factory.getBean("movie", Movie.class);
        m1.display();
        BeanDefinitionRegistry beanFactory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new FileSystemResource("/home/pranitha/MavenFirstTask/src/main/resources/beans.xml"));
        Movie m2=((DefaultListableBeanFactory)beanFactory).getBean(Movie.class);
        m2.display();

    }

}
