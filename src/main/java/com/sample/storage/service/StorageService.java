package com.sample.storage.service;

import com.amazonaws.services.s3.AmazonS3Client;
import org.springframework.stereotype.Service;

@Service
public class StorageService {

    private final AmazonS3Client amazonS3Client;

    public StorageService(AmazonS3Client amazonS3Client) {
        this.amazonS3Client = amazonS3Client;
    }

}
