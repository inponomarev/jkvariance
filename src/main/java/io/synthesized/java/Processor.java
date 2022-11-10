package io.synthesized.java;

import java.util.function.Function;

public class Processor<E> {
    public void withFunction(
            Function<? super KStream<E>, ? extends KStream<E>> chain) {
    }
}
