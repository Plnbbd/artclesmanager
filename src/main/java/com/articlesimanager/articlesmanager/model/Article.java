package com.articlesimanager.articlesmanager.model;

import lombok.Data;

@Data
public class Article {
    private Long id;
    private String titre;
    private String contenu;
    private String image;
    private String auteur;
    private String langue;
    private String createdAt;

    
}
