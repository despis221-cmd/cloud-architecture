package org.example.cloudarchitecture.member.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class MemberRequestDto {

    @NotBlank
    @Size(max = 10)
    private String name;

    @Positive
    @Max(100)
    private int age;

    @NotBlank
    @Size(min = 4, max = 4)
    private String mbti;
}
