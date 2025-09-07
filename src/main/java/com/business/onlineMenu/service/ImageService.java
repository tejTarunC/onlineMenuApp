package com.business.onlineMenu.service;

import com.business.onlineMenu.Utils.ImageUtils;
import com.business.onlineMenu.model.Image;
import com.business.onlineMenu.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class ImageService {

  @Autowired
  private ImageRepository repository;

  public String uploadImage(MultipartFile imageFile) throws IOException {
    Image image = repository.save(Image.builder()
      .imageData(ImageUtils.compressImage(imageFile.getBytes()))
      .build());
    return "Image uploaded successfully: " + imageFile.getOriginalFilename();
  }

}
