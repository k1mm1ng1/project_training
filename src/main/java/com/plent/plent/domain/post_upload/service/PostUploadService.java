package com.plent.plent.domain.post_upload.service;

import com.plent.plent.domain.post_upload.entity.PostUpload;
import com.plent.plent.domain.post_upload.repository.PostUploadRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class PostUploadService {
    private final PostUploadRepository postUploadRepository;

    public List findAll() {
        return postUploadRepository.findAll();
    }

    public PostUpload Create(PostUpload post_upload) {
        return postUploadRepository.save(post_upload);
    }

    public PostUploadService(PostUploadRepository postUploadRepository) {
        this.postUploadRepository = postUploadRepository;
    }
}
