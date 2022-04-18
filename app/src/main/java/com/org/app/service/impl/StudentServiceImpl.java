package com.org.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

import com.org.app.entity.PhysicalEvaluation;
import com.org.app.entity.Student;
import com.org.app.entity.form.StudentForm;
import com.org.app.entity.form.StudentUpdateForm;
import com.org.app.infra.utils.JavaTimeUtils;
import com.org.app.repository.StudentRepository;
import com.org.app.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

  @Autowired
  private StudentRepository repository;

  @Override
  public Student create(StudentForm form) {
    Student student = new Student();
    student.setName(form.getName());
    student.setCpf(form.getCpf());
    student.setDistrict(form.getDistrict());
    student.setBirthDate(form.getBirthDate());

    return repository.save(student);
  }

  @Override
  public Student get(Long id) {
    return null;
  }

  @Override
  public List<Student> getAll(String birthDate) {

    if(birthDate == null) {
      return repository.findAll();
    } else {
      LocalDate localDate = LocalDate.parse(birthDate, JavaTimeUtils.LOCAL_DATE_FORMATTER);
      return repository.findByBirthDate(localDate);
    }

  }

  @Override
  public Student update(Long id, StudentUpdateForm formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {
  }

  @Override
  public List<PhysicalEvaluation> getAllPhysicalEvaluationId(Long id) {

    Student student = repository.findById(id).get();

    return student.getEvaluations();

  }


}
