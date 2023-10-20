package com.plent.plent.domain.sing_up.dto;

import lombok.Getter;

import javax.persistence.*;

@Getter
public class PlentRequestDto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String user_id;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String password_check;

}
