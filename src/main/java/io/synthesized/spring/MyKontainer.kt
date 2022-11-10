package io.synthesized.spring

open class MyKontainer<out T>(val value: T) {
    override fun toString(): String {
        return "MyKontainer(value=$value)"
    }
}
