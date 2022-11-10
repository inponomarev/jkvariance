package io.synthesized.java;

import io.synthesized.elements.Employee;
import io.synthesized.elements.Manager;
import io.synthesized.elements.Person;

public class UserAppTooManyQuestions {
    private KStream<Employee> transformA(KStream<? extends Employee> s) {
        return new KStream<>();
    }

    private KStream<Manager> transformB(KStream<? extends Person> s) {
        return new KStream<>();
    }


    public void code() {
        ProcessorTooManyQuestions<Employee> processor = new ProcessorTooManyQuestions<>();
        processor.withFunction(this::transformA);
        processor.withFunction(this::transformB);
    }
}
