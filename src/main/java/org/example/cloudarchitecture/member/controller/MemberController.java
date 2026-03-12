package org.example.cloudarchitecture.member.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.cloudarchitecture.member.common.ApiResponse;
import org.example.cloudarchitecture.member.dto.MemberRequestDto;
import org.example.cloudarchitecture.member.dto.MemberResponseDto;
import org.example.cloudarchitecture.member.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
@RequestMapping("api/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<ApiResponse<MemberResponseDto>> save(@Valid @RequestBody MemberRequestDto request) {
        log.info("[API - LOG] POST /api/members - name={}, age={}, mbti={}", request.getName(), request.getAge(), request.getMbti());
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.success("저장 성공", memberService.save(request)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<MemberResponseDto>> findById(@PathVariable Long id) {
        log.info("[API - LOG] GET /api/members/{}", id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(ApiResponse.success("조회 성공", memberService.findById(id)));
    }

    @PostMapping("/{id}/profile-image")
    public ResponseEntity<ApiResponse<Void>> uploadProfileImage(@PathVariable Long id, @RequestParam("file") MultipartFile file) {
        log.info("[API - LOG] POST /api/members/{}/profile-image", id);
        memberService.uploadProfileImage(id, file);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.success("프로필 이미지 업로드 성공", null));
    }

    @GetMapping("/{id}/profile-image")
    public ResponseEntity<ApiResponse<String>> getProfileImageUrl(@PathVariable Long id) {
        log.info("[API - LOG] GET /api/members/{}/profile-image", id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(ApiResponse.success("Presigned URL 조회 성공", memberService.getProfileImageUrl(id)));
    }
}
