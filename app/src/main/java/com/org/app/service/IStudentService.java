package com.org.app.service;


import java.time.LocalDate;
import java.util.List;

import com.org.app.entity.PhysicalEvaluation;
import com.org.app.entity.Student;
import com.org.app.entity.form.StudentForm;
import com.org.app.entity.form.StudentUpdateForm;

public interface IStudentService {
  /**
   * Cria um Student e salva no banco de dados.
   * @param form formulário referente aos dados para criação de um Student no banco de dados.
   * @return Student recém-criado.
   */
  Student create(StudentForm form);

  /**
   * Retorna um Student que está no banco de dados de acordo com seu Id.
   * @param id id do Student que será exibido.
   * @return Student de acordo com o Id fornecido.
   */
  Student get(Long id);

  /**
   * Retorna os Students que estão no banco de dados.
   * @return Uma lista os Students que estão salvas no DB.
   */
  List<Student> getAll(String dataDeNascimento);

  /**
   * Atualiza o Student.
   * @param id id do Student que será atualizado.
   * @param formUpdate formulário referente aos dados necessários para atualização do Student
   * no banco de dados.
   * @return Student recém-atualizado.
   */
  Student update(Long id, StudentUpdateForm formUpdate);

  /**
   * Deleta um Student específico.
   * @param id id do Student que será removido.
   */
  void delete(Long id);

  /**
   *
   * @param id id do Student que será recuperada a lista de avaliações
   * @return uma lista com todas as avaliações do Student de acordo com o Id
   */
  List<PhysicalEvaluation> getAllPhysicalEvaluationId(Long id);


}
