package com.sejin.java.language.collection;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class HashMapTests {


    @Test
    void differenceBetweenArrays() {
        //given
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};
        String answer = "";

        //when
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }

        //then
        assertThat(answer).isEqualTo("leo");
    }

}
