package com.articlesimanager.articlesmanager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.articlesimanager.articlesmanager.model.Article;
import com.articlesimanager.articlesmanager.service.ArticleService;

//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://joyful-cucurucho-727ab9.netlify.app")
@RestController
@RequestMapping("/api/articles")
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("/{id}")
    public Article getArticle(@PathVariable Long id) {
        return articleService.getArticleById(id);
    }
}
