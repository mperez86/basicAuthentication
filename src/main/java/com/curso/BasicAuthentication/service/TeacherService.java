package com.curso.BasicAuthentication.service;

import com.curso.BasicAuthentication.dao.TeacherDaoInterface;
import com.curso.BasicAuthentication.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("teacherService")
public class TeacherService implements TeacherServiceInterface {

    @Autowired
    private TeacherDaoInterface teacherDao;

    @Override
    public List<Teacher> findAllTeacher() {
        return (List<Teacher>) teacherDao.findAll();
    }
}
