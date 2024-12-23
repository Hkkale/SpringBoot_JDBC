package com.hiten.springboot_jdbc.model;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Alien {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private String name;
    private int age;

    private String domain;

    private int exp;

    public Alien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", domain='" + domain + '\'' +
                ", exp=" + exp +
                '}';
    }

}
