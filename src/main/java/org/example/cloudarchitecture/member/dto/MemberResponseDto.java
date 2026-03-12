package org.example.cloudarchitecture.member.dto;

import lombok.Getter;
import org.example.cloudarchitecture.member.entity.Member;

@Getter
public class MemberResponseDto {
    private Long id;
    private String name;
    private int age;
    private String mbti;
    private String profileImageKey;

    public MemberResponseDto(Member member) {
        this.id = member.getId();
        this.name = member.getName();
        this.age = member.getAge();
        this.mbti = member.getMbti();
        this.profileImageKey = member.getProfileImageKey();
    }
}
