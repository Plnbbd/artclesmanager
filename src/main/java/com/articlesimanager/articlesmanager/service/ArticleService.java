package com.articlesimanager.articlesmanager.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.articlesimanager.articlesmanager.model.Article;

@Service
public class ArticleService {
    private final RestTemplate restTemplate;
    private final String BASE_URL = "https://api-donnees-explomboa.onrender.com"; // à adapter

    public ArticleService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public List<Article> getAllArticles() {
        ResponseEntity<Article[]> response = restTemplate.getForEntity(BASE_URL + "/articles", Article[].class);
        return Arrays.asList(response.getBody());
    }

    public Article getArticleById(Long id) {
        return restTemplate.getForObject(BASE_URL + "/articles/" + id, Article.class);
    }
}

