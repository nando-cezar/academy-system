package com.org.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

import com.org.app.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

  /**
   *
   * @param birthDate: data de nascimento dos Students
   * @return lista com todos os Students com a data de nascimento passada como parâmetro da função
   */
  List<Student> findByBirthDate(LocalDate birthDate);

}
