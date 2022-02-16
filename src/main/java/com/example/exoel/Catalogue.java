package com.example.exoel;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {

    List<Article> bddArticles;
    int index;

    public Catalogue() {
        index = 0;
        bddArticles = new ArrayList<Article>();
        bddArticles.add(new Article(0,"Poire",2));
        bddArticles.add(new Article(1,"Fraise",3));
        bddArticles.add(new Article(2,"Clémentine",1));
        bddArticles.add(new Article(3,"Abricot",4));
    }

    public List<Article> getBddArticles() {
        return bddArticles;
    }

    public void setBddArticles(List<Article> bddArticles) {
        this.bddArticles = bddArticles;
    }

    public Article getArticle(int index){
        return bddArticles.get(index);
    }
}