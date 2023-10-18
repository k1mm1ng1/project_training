package com.plent.plent.domain.post_upload.controller;

import com.plent.plent.domain.post_upload.entity.PostUpload;
import com.plent.plent.domain.post_upload.service.PostUploadService;
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
public class PostUploadController {
    private final PostUploadService postUploadService;

    @PostMapping("/create")
    public ResponseEntity<?> createPost(@RequestBody PostUpload post_upload) {
        postUploadService.Create(post_upload);
        return new ResponseEntity<>(post_upload, HttpStatus.OK);
    }

    @GetMapping("/posts")
    public ResponseEntity<?> posts() {
        List posts = postUploadService.findAll();
        return new ResponseEntity<>(posts,HttpStatus.OK);
    }
}
