package io.synthesized.elements;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Person {
    private final String name;

    @Override
    public String toString() {
        return name;
    }
}
