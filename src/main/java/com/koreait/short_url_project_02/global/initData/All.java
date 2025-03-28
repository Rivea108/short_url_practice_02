package com.koreait.short_url_project_02.global.initData;

import com.koreait.short_url_project_02.domain.member.member.entity.Member;
import com.koreait.short_url_project_02.domain.member.member.service.MemberService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.Order;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class All {
    @Lazy
    @Autowired
    private All self;

    private final MemberService memberService;

    @Bean
    @Order(3)
    public ApplicationRunner initAll() {
        return args -> {
            self.work1();
        };
    }

    @Transactional
    public void work1() {
        log.debug("initAll start");

<<<<<<< HEAD
=======
        log.info("initAll start");

>>>>>>> 64b4c24 (자동배포 테스트)
        if (memberService.count() > 0) return;

        Member memberSystem = memberService.join("system", "1234", "시스템").getData();
        Member memberAdmin = memberService.join("admin", "1234", "관리자").getData();
        Member member1 = memberService.join("user1", "1234", "회원 1").getData();
        Member member2 = memberService.join("user2", "1234", "회원 2").getData();


    }

}


