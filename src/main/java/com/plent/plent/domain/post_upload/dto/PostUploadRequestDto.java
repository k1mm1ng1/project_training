package com.plent.plent.domain.post_upload.dto;


import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
public class PostUploadRequestDto {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String title;
    @Column(nullable = false)
    private String content;
}
