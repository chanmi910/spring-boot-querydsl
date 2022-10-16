package com.example.querydsl.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    private String userName;

    private int age;
}