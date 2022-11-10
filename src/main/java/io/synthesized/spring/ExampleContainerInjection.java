package io.synthesized.spring;

import io.synthesized.elements.Employee;
import io.synthesized.elements.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

import static java.lang.System.out;

@Component
@RequiredArgsConstructor
public class ExampleContainerInjection {
    final List<Person> people;
    final List<MyContainer<Employee>> containers;
    final MyContainer<Employee> employeeContainer;

    @PostConstruct
    void code() {
        out.println("JAVA");
        out.println("People: " + people);
        out.println("Containers: " + containers);
        out.println("Employee: " + employeeContainer);
        out.println();
    }
}
