package io.synthesized.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("io.synthesized.spring")
public class App {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(App.class);
    }
}
