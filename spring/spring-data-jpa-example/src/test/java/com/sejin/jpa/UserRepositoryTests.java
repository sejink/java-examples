package com.sejin.jpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void findSavedUserById() {
        User user = new User("user1", "sejin", "kim");
        user = userRepository.save(user);

        Optional<User> result = userRepository.findById(user.getUsername());
        if(result.isPresent()) {
            assertThat(result.get().getFirstName()).isEqualTo(user.getFirstName());
        }
    }
}
