package com.org.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import com.org.app.entity.PhysicalEvaluation;
import com.org.app.entity.Student;
import com.org.app.entity.form.StudentForm;
import com.org.app.service.impl.StudentServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

  @Autowired
  private StudentServiceImpl service;

  @PostMapping
  public Student create(@Valid @RequestBody StudentForm form) {
    return service.create(form);
  }

  @GetMapping("/evaluations/{id}")
  public List<PhysicalEvaluation> getAllPhysicalEvaluationId(@PathVariable Long id) {
    return service.getAllPhysicalEvaluationId(id);
  }

  @GetMapping
  public List<Student> getAll(@RequestParam(value = "birthDate", required = false)
                                  String birthDate){
    return service.getAll(birthDate);
  }


}
