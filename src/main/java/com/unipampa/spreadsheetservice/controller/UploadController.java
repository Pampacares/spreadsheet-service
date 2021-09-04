package com.unipampa.spreadsheetservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/upload")
public class UploadController {

  @PostMapping("/new")
  public ResponseEntity<?> handleUpload(@RequestParam("file") MultipartFile file) {

    return new ResponseEntity<>("All Good", HttpStatus.OK);
  }
}
