package org.example.springbootdeveloper.dto;

import lombok.Getter;
import org.example.springbootdeveloper.domain.Article;

@Getter
public class ArticleResponse {  //데이터를 반환하기 위한 dto

    private final String title;
    private final String content;

    public ArticleResponse(Article article){
         this.title = article.getTitle();
         this.content = article.getContent();
    }
}
