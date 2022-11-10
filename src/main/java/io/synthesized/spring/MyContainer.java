package io.synthesized.spring;

import lombok.Data;

@Data
public class MyContainer<T> {
    private final T value;
}
