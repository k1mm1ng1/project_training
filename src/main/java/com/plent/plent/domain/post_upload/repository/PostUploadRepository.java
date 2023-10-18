package com.plent.plent.domain.post_upload.repository;

import com.plent.plent.domain.post_upload.entity.PostUpload;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostUploadRepository extends JpaRepository<PostUpload,String> {
    List<PostUpload> findAll();
    PostUpload save(PostUpload post_upload);
}
