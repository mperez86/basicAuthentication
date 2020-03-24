package com.curso.BasicAuthentication.controller;

import com.curso.BasicAuthentication.entity.Teacher;
import com.curso.BasicAuthentication.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherRestController {

    @Autowired
    TeacherService teacherService;

    @RequestMapping(value = "/all_teachers_public", method = RequestMethod.GET)
    public ResponseEntity<List<Teacher>> listAllTeacher() {
        List<Teacher> teachers = teacherService.findAllTeacher();

        if(teachers.isEmpty()) {
            return new ResponseEntity<List<Teacher>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Teacher>>(teachers, HttpStatus.OK);
    }

    @RequestMapping(value = "/all_teachers_admin", method = RequestMethod.GET)
    public ResponseEntity<List<Teacher>> listAllTeacherAdmin() {
        List<Teacher> teachers = teacherService.findAllTeacher();

        if(teachers.isEmpty()) {
            return new ResponseEntity<List<Teacher>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Teacher>>(teachers, HttpStatus.OK);
    }

    @RequestMapping(value = "/all_teachers_user", method = RequestMethod.GET)
    public ResponseEntity<List<Teacher>> listAllTeacherUser() {
        List<Teacher> teachers = teacherService.findAllTeacher();

        if(teachers.isEmpty()) {
            return new ResponseEntity<List<Teacher>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Teacher>>(teachers, HttpStatus.OK);
    }
}
