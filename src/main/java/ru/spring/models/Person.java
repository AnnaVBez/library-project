package ru.spring.models;

import javax.validation.constraints.*;

public class Person {
    private int id;

    @NotEmpty(message = "Поле ФИО не должно быть пустым!")
    @Size(min = 3, max = 100, message = "Проверьте правильность ввода ФИО!")
    private String fio;

    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Проверьте правильность ввода даты!")
    private String birthday;

    public Person() {
    }

    public Person(int id, String fio, String birthday) {
        this.id = id;
        this.fio = fio;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
