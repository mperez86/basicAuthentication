package com.curso.BasicAuthentication.dao;

import com.curso.BasicAuthentication.entity.Teacher;
import org.springframework.data.repository.CrudRepository;

// el long es el id
public interface TeacherDaoInterface extends CrudRepository<Teacher, Long> {

}
