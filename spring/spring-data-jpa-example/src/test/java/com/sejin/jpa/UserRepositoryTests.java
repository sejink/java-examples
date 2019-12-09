package com.sejin.jpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void findSavedUserById() {
        User user = new User("user1", "sejin", "kim");
        user = userRepository.save(user);
        assertThat(userRepository.findById(user.getUsername()).get())
                .isEqualToComparingFieldByField(user);
    }
}
