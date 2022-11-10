package io.synthesized.kotlin

import io.synthesized.elements.Employee
import io.synthesized.elements.Manager
import io.synthesized.elements.Person

class UserApp {

    private fun transformA(s: KStream<Employee>): KStream<Employee> { TODO() }
    private fun transformB(s: KStream<Person>): KStream<Manager> { TODO() }

    fun code(){
        val processor: Processor<Employee> = Processor()
        processor.withFunction(this::transformA)
        processor.withFunction(this::transformB)
    }
}