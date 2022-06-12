package com.aike.service;

import org.springframework.web.multipart.MultipartFile;

public interface DataService {
    int resetData(MultipartFile file);

    int cumulationData(MultipartFile file, String dName, Integer dSno);
}
