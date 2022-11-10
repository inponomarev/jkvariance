package io.synthesized.kotlin

class Processor<E> {
    fun withFunction(chain: (KStream<E>) -> KStream<E>) {}

}