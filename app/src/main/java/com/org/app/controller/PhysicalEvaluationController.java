package com.org.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.org.app.entity.PhysicalEvaluation;
import com.org.app.entity.form.PhysicalEvaluationForm;
import com.org.app.service.impl.PhysicalEvaluationServiceImpl;

@RestController
@RequestMapping("/evaluations")
public class PhysicalEvaluationController {

  @Autowired
  private PhysicalEvaluationServiceImpl service;

  @PostMapping
  public PhysicalEvaluation create(@RequestBody PhysicalEvaluationForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<PhysicalEvaluation> getAll(){
    return service.getAll();
  }

}
