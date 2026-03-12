package org.example.cloudarchitecture.member.service;

import lombok.RequiredArgsConstructor;
import org.example.cloudarchitecture.member.common.CustomException;
import org.example.cloudarchitecture.member.common.ErrorCode;
import org.example.cloudarchitecture.member.dto.MemberRequestDto;
import org.example.cloudarchitecture.member.dto.MemberResponseDto;
import org.example.cloudarchitecture.member.entity.Member;
import org.example.cloudarchitecture.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberResponseDto save(MemberRequestDto request) {
        Member member = new Member(request.getName(), request.getAge(), request.getMbti());
        return new MemberResponseDto(memberRepository.save(member));
    }

    public MemberResponseDto findById(Long id) {
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new CustomException(ErrorCode.MEMBER_NOT_FOUND));
        return new MemberResponseDto(member);
    }
}
