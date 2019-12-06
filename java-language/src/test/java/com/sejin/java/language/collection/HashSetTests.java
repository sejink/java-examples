package com.sejin.java.language.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

public class HashSetTests {

    @Test
    void createHashSetFromArray() {
        String[] array = {"A", "B", "C", "C"};
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(array));
        assertThat(hashSet.toArray()).isNotEqualTo(array);
    }

}
