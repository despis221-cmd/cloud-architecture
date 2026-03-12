package org.example.cloudarchitecture.member.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND, "존재하지 않는 팀원입니다."),
    INVALID_INPUT(HttpStatus.BAD_REQUEST, "잘못된 입력값입니다."),
    INVALID_NAME(HttpStatus.BAD_REQUEST, "이름은 10글자 이내여야 합니다."),
    INVALID_AGE(HttpStatus.BAD_REQUEST, "나이는 3자리 이내 양수여야 합니다."),
    INVALID_MBTI(HttpStatus.BAD_REQUEST, "MBTI는 4글자여야 합니다."),
    FILE_UPLOAD_FAILED(HttpStatus.INTERNAL_SERVER_ERROR, "파일 업로드에 실패했습니다.");

    private final HttpStatus status;
    private final String message;
}
