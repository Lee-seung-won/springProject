package com.example.memo.entity;

import com.example.memo.DTO.MemoRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Memo {
    private Long id;
    private String title;
    private String content;

    public void update(MemoRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
    }

    public void updateTitle(MemoRequestDto requestDto) {
        this. title = requestDto.getTitle();
    }
}
