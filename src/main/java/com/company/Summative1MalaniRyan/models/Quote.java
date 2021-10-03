package com.company.Summative1MalaniRyan.models;

import java.util.Objects;

public class Quote {

    // properties

    private int id;
    private String author;
    private String quote;

    // default constructor

    public Quote() {

    }

    // constructor

    public Quote(int id, String author, String quote) {
        this.id = id;
        this.author = author;
        this.quote = quote;
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quote quote1 = (Quote) o;
        return getId() == quote1.getId() && Objects.equals(getAuthor(), quote1.getAuthor()) && Objects.equals(getQuote(), quote1.getQuote());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAuthor(), getQuote());
    }

    // toString

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", quote='" + quote + '\'' +
                '}';
    }
}
