package com.org.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.org.app.entity.Enrollment;
import com.org.app.entity.Student;
import com.org.app.entity.form.EnrollmentForm;
import com.org.app.repository.EnrollmentRepository;
import com.org.app.repository.StudentRepository;
import com.org.app.service.IEnrollmentService;

@Service
public class EnrollmentServiceImpl implements IEnrollmentService {

  @Autowired
  private EnrollmentRepository enrollmentRepository;

  @Autowired
  private StudentRepository studentRepository;

  @Override
  public Enrollment create(EnrollmentForm form) {
    Enrollment enrollment = new Enrollment();
    Student student = studentRepository.findById(form.getStudentId()).get();

    enrollment.setStudent(student);

    return enrollmentRepository.save(enrollment);
  }

  @Override
  public Enrollment get(Long id) {
    return enrollmentRepository.findById(id).get();
  }

  @Override
  public List<Enrollment> getAll(String district) {

    if(district == null){
      return enrollmentRepository.findAll();
    }else{
      return enrollmentRepository.findstudentsEnrollmentDistricts(district);
    }

  }

  @Override
  public void delete(Long id) {}



}
