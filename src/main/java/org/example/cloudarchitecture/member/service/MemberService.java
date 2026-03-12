package org.example.cloudarchitecture.member.service;

import lombok.RequiredArgsConstructor;
import org.example.cloudarchitecture.member.common.CustomException;
import org.example.cloudarchitecture.member.common.ErrorCode;
import org.example.cloudarchitecture.member.dto.MemberRequestDto;
import org.example.cloudarchitecture.member.dto.MemberResponseDto;
import org.example.cloudarchitecture.member.entity.Member;
import org.example.cloudarchitecture.member.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final S3Service s3Service;

    public MemberResponseDto save(MemberRequestDto request) {
        Member member = new Member(request.getName(), request.getAge(), request.getMbti());
        return new MemberResponseDto(memberRepository.save(member));
    }

    public MemberResponseDto findById(Long id) {
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new CustomException(ErrorCode.MEMBER_NOT_FOUND));
        return new MemberResponseDto(member);
    }

    public void uploadProfileImage(Long id, MultipartFile file) {
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new CustomException(ErrorCode.MEMBER_NOT_FOUND));
        String key = s3Service.upload(file);
        member.updateProfileImageKey(key);
        memberRepository.save(member);
    }

    public String getProfileImageUrl(Long id) {
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new CustomException(ErrorCode.MEMBER_NOT_FOUND));
        return s3Service.getPresignedUrl(member.getProfileImageKey());
    }
}
