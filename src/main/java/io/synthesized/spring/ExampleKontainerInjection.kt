package io.synthesized.spring

import io.synthesized.elements.Employee
import io.synthesized.elements.Person
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class ExampleKontainerInjection(
    val people: List<Person>,
    val kontainers: List<MyKontainer<@JvmSuppressWildcards Employee>>,
    val employeeContainer: MyKontainer<@JvmSuppressWildcards Employee>
) {
    @PostConstruct
    fun code() {
        println("KOTLIN")
        println("People: $people")
        println("Kontainers: $kontainers")
        println("EmployeeContainer: $employeeContainer")
        println()
    }
}