package com.driver.controller;

import com.driver.models.Blog;
import com.driver.models.Image;
import com.driver.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/images")
public class ImageController {

    @PostMapping("/create")
    public ResponseEntity<Image> createAndReturn(@RequestBody Blog blog,
                                                 @RequestParam String description,
                                                 @RequestParam String dimensions) {
        Image image = null;
        return new ResponseEntity<>(image, HttpStatus.CREATED);
    }

    @GetMapping("/countImagesInScreen/{id}/{screenDimensions}")
    public ResponseEntity<Integer> countImagesInScreen(@PathVariable int id, @PathVariable String screenDimensions){
        int count = 0;
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteImage(@PathVariable int id) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}



