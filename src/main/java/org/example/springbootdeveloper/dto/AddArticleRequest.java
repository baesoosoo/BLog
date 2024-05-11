package org.example.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.springbootdeveloper.domain.Article;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest { //서버로 전송하기 위한 dto

    private String title;

    private String content;

    public Article toEntity(){  //생성자를 사용해 객체 생성

        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
