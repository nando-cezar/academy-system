package com.org.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import com.org.app.entity.Enrollment;
import com.org.app.entity.form.EnrollmentForm;
import com.org.app.service.impl.EnrollmentServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

  @Autowired
  private EnrollmentServiceImpl service;

  @PostMapping
  public Enrollment create(@Valid @RequestBody EnrollmentForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<Enrollment> getAll(@RequestParam(value = "district", required = false) String district) {
    return service.getAll(district);
  }

}

