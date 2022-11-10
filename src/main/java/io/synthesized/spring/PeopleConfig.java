package io.synthesized.spring;

import io.synthesized.elements.Employee;
import io.synthesized.elements.Manager;
import io.synthesized.elements.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PeopleConfig {
    @Bean
    Person person() {
        return new Person("bystander");
    }
    @Bean
    Employee employee() {
        return new Employee("programmer");
    }
    @Bean
    Manager manager() {
        return new Manager("ceo");
    }
}
