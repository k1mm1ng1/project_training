package com.plent.plent.domain.sing_up.repository;


import com.plent.plent.domain.sing_up.entity.Plent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PlentRepository extends JpaRepository<Plent, Long> {
    List<Plent> findAll();

    Plent save(Plent plent);
}
