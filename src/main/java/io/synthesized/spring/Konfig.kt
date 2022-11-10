package io.synthesized.spring

import io.synthesized.elements.Employee
import io.synthesized.elements.Manager
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
open class Konfig {

    @Bean
    open fun employeeKontainer(employee: Employee): MyKontainer<Employee> {
        //MyKontainer is covariant!
        return MyKontainer(employee)
    }

    @Bean
    open fun managerKontainer(manager: Manager): MyKontainer<Manager> {
        //MyKontainer is covariant!
        return MyKontainer(manager)
    }
}