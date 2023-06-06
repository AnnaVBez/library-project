package ru.spring.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;

    private Integer personId;

    @NotEmpty(message = "Поле название не должно быть пустым!")
    @Size(min = 3, max = 100, message = "Проверьте правильность ввода названия!")
    private String title;

    @NotEmpty(message = "Поле автор не должно быть пустым!")
    @Size(min = 3, max = 100, message = "Проверьте правильность ввода автора!")
    private String author;

    @Min(value = 1200, message = "Год должен быть больше, чем 1200!")
    private int year;

    public Book() {

    }

    public Book(int id, Integer personId, String title, String author, int year) {
        this.id = id;
        this.personId = personId;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
