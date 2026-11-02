package com.example.demo;

import com.example.demo.controllers.StudentController;
import com.example.demo.entities.Student;
import com.example.demo.services.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class StudentControllerTest {

    @Mock
    private StudentService studentService;

    @InjectMocks
    private StudentController studentController;

    @Test
    public void testFindAll() {
        Student s = new Student("Dupont", "Jean", new Date());
        Mockito.when(studentService.findAll()).thenReturn(Collections.singletonList(s));

        ResponseEntity<List<Student>> response = studentController.findAll();
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assertions.assertEquals(1, response.getBody().size());
    }
}
