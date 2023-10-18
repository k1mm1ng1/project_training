package com.plent.plent.domain.sing_up.controller;

import com.plent.plent.domain.sing_up.entity.Plent;
import com.plent.plent.domain.sing_up.service.PlentService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PlentController {

    private final PlentService plentService;

    @GetMapping("/plents")
    public ResponseEntity<?> plents() {
        List plents = plentService.findAll();
        return new ResponseEntity<>(plents, HttpStatus.OK);
    }

    @PostMapping("/create/plent")
    public ResponseEntity<?> createPlent(@RequestBody Plent plent){
        plentService.Create(plent);
        return new ResponseEntity<>(plent,HttpStatus.OK);
    }
}
