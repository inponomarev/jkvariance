package io.synthesized.java;

import java.util.function.Function;

public class ProcessorTooManyQuestions<E> {
    void withFunction(Function<? super KStream<? extends E>,
                ? extends KStream<? extends E>> chain) { }
}
