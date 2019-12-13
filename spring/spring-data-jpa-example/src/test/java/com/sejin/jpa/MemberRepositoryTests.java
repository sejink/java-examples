package com.sejin.jpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class MemberRepositoryTests {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void findSavedUserById() {
        Member member = new Member ("user1", "sejin", "kim");
        member = memberRepository.save(member);
        assertThat(memberRepository.findById(member.getUsername()).get())
                .isEqualToComparingFieldByField(member);
    }
}
