package com.org.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.org.app.entity.Enrollment;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

  /**
   *
   * @param district district referência para o filtro
   * @return lista de students Enrollmentdos que residem no district passado como parâmetro
   */
  @Query(value = "SELECT * FROM tb_enrollments m " +
      "INNER JOIN tb_students a ON m.student_id = a.id " +
      "WHERE a.district = :district", nativeQuery = true)
  //@Query("FROM Enrollment m WHERE m.student.district = :district ")
  List<Enrollment> findstudentsEnrollmentDistricts(String district);

  //List<Enrollment> findBystudentdistrict(String district);


}
