package com.plent.plent.domain.sing_up.entity;

import com.plent.plent.domain.sing_up.dto.PlentRequestDto;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "plent")
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class Plent {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String user_id;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String password_check;

    public Plent(PlentRequestDto plentRequestDto){
        this.user_id = plentRequestDto.getUser_id();
        this.password = plentRequestDto.getPassword();


    }

}
