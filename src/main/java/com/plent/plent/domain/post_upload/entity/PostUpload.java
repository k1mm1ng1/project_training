package com.plent.plent.domain.post_upload.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "post_upload")
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class PostUpload {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String content;

}
