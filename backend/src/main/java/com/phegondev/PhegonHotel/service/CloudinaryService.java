package com.phegondev.PhegonHotel.service;

import com.cloudinary.Cloudinary;
import com.phegondev.PhegonHotel.exception.OurException;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;
import java.util.UUID;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Service
@RequiredArgsConstructor
public class CloudinaryService {
    Cloudinary cloudinary;

    public String uploadImage(MultipartFile multipartFile) {
        try {
            return cloudinary.uploader().upload(multipartFile.getBytes(), Map.of("public_id", UUID.randomUUID().toString()))
                    .get("url")
                    .toString();
        } catch (Exception e) {
            e.printStackTrace();
            throw new OurException("Unable to upload image to cloudinary" + e.getMessage());
        }
    }

}
