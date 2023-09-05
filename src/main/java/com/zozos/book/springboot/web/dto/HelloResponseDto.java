package com.zozos.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter //①
@RequiredArgsConstructor //②
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
