package com.koreait.short_url_project_02.domain.member.member.service;

import com.koreait.short_url_project_02.domain.member.member.entity.Member;
import com.koreait.short_url_project_02.domain.member.member.repository.MemberRepository;
import com.koreait.short_url_project_02.global.exceptions.GlobalException;
import com.koreait.short_url_project_02.global.rsData.RsData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public RsData<Member> join(String username, String password, String nickname) {

        findByUsername(username).ifPresent(ignored -> {
            throw new GlobalException("400-1", "이미 존재하는 아이디야");
        });

        Member member = Member.builder()
                .username(username)
                .password(password)
                .nickname(nickname)
                .build();
        memberRepository.save(member);
        return RsData.of("회원가입이 완료되었습니다.", member);
    }
    private Optional<Member> findByUsername(String username) {
        return memberRepository.findByUsername(username);
    }
}
