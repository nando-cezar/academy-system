package com.org.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.org.app.entity.PhysicalEvaluation;
import com.org.app.entity.Student;
import com.org.app.entity.form.PhysicalEvaluationForm;
import com.org.app.entity.form.PhysicalEvaluationUpdateForm;
import com.org.app.repository.PhysicalEvaluationRepository;
import com.org.app.repository.StudentRepository;
import com.org.app.service.IPhysicalEvaluationService;

@Service
public class PhysicalEvaluationServiceImpl implements IPhysicalEvaluationService {

  @Autowired
  private PhysicalEvaluationRepository physicalEvaluationRepository;

  @Autowired
  private StudentRepository studentRepository;

  @Override
  public PhysicalEvaluation create(PhysicalEvaluationForm form) {
    PhysicalEvaluation physicalEvaluation = new PhysicalEvaluation();
    Student student = studentRepository.findById(form.getStudentId()).get();

    physicalEvaluation.setStudent(student);
    physicalEvaluation.setWeight(form.getWeight());
    physicalEvaluation.setHeight(form.getHeight());

    return physicalEvaluationRepository.save(physicalEvaluation);
  }

  @Override
  public PhysicalEvaluation get(Long id) {
    return null;
  }

  @Override
  public List<PhysicalEvaluation> getAll() {

    return physicalEvaluationRepository.findAll();
  }

  @Override
  public PhysicalEvaluation update(Long id, PhysicalEvaluationUpdateForm formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {

  }
}
