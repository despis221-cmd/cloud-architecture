package org.example.cloudarchitecture.member.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ApiResponse<Void>> handleCustomException(CustomException e) {
        log.error("[API - LOG] CustomException: {}", e.getMessage(), e);
        ErrorCode errorCode = e.getErrorCode();
        return ResponseEntity.status(errorCode.getStatus())
                .body(ApiResponse.error(errorCode.getMessage()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse<Void>> handleValidException(MethodArgumentNotValidException e) {
        log.error("[API - LOG] ValidationException: {}", e.getMessage(), e);
        return ResponseEntity.badRequest()
                .body(ApiResponse.error(e.getBindingResult().getAllErrors().get(0).getDefaultMessage()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<Void>> handleException(Exception e) {
        log.error("[API - LOG] Exception: {}", e.getMessage(), e);
        return ResponseEntity.internalServerError()
                .body(ApiResponse.error("서버 오류가 발생했습니다."));
    }
}
