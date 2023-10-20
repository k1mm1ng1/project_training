package com.plent.plent.domain.sing_up.service;

import com.plent.plent.domain.sing_up.entity.Plent;
import com.plent.plent.domain.sing_up.repository.PlentRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class PlentService {
    private final PlentRepository plentRepository;

    public List findAll() {
        return plentRepository.findAll();
    }
    public Plent Create(Plent plent) {
        return plentRepository.save(plent);
    }

    @Autowired
    public PlentService(PlentRepository plentRepository) {
        this.plentRepository = plentRepository;
    }

}
