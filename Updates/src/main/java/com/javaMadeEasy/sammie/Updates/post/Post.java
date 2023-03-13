package com.javaMadeEasy.sammie.Updates.post;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date= LocalDate.now();
    private String title;
    private String body;

    private String comment;


    public Post() {
    }

    public Post(LocalDate date, String title, String body, String comment) {
        this.date = date;
        this.title = title;
        this.body = body;
        this.comment = comment;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", date=" + date +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
