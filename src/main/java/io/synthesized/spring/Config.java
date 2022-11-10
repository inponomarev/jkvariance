package io.synthesized.spring;


import io.synthesized.elements.Employee;
import io.synthesized.elements.Manager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    MyContainer<Employee> employeeContainer(Employee employee) {
        return new MyContainer<>(employee);
    }

    @Bean
    MyContainer<Manager> managerContainer(Manager manager) {
        return new MyContainer<>(manager);
    }
}
