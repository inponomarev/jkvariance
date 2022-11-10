package io.synthesized.java;

import io.synthesized.elements.Employee;
import io.synthesized.elements.Manager;
import io.synthesized.elements.Person;

public class UserApp {
    private KStream<Employee> transformA(KStream<Employee> s) {
        return new KStream<>();
    }

    private KStream<Manager> transformB(KStream<Person> s) {
        return new KStream<>();
    }


    public void code() {
        Processor<Employee> processor = new Processor<>();
        processor.withFunction(this::transformA);
        //processor.withFunction(this::transformB);
        processor.withFunction(s -> (KStream<Employee>) ((KStream<?>)
                transformB((KStream<Person>) ((KStream<?>) s))));
    }
}
