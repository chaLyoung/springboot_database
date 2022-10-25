package com.dev.springboot_database.vo.common;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CommonApiResponseVo<T> extends AbstractApiVo {
    private static final long serialVersionUID = 1L;

    @Builder.Default
    private boolean result      = true;
    @Builder.Default
    private boolean isAuthError = false;
    private String  code;
    private String  message;

    // Response Data
    private T data;
}