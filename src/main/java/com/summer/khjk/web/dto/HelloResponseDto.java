package com.summer.khjk.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

//모든 응답 Dto
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
