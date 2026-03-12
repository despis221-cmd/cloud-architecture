package org.example.cloudarchitecture.member.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.cloudarchitecture.member.common.ApiResponse;
import org.example.cloudarchitecture.member.dto.MemberRequestDto;
import org.example.cloudarchitecture.member.dto.MemberResponseDto;
import org.example.cloudarchitecture.member.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<ApiResponse<MemberResponseDto>> save(@Valid @RequestBody MemberRequestDto request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.success("저장 성공", memberService.save(request)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<MemberResponseDto>> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(ApiResponse.success("조회 성공", memberService.findById(id)));
    }
}
