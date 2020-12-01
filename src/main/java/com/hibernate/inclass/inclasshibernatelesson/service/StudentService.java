package com.hibernate.inclass.inclasshibernatelesson.service;

import com.hibernate.inclass.inclasshibernatelesson.entity.Student;
import com.hibernate.inclass.inclasshibernatelesson.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

  @Autowired
  private StudentRepository repo;

  public Student saveStudent(Student student) {
    return repo.save(student);
  }

  public List<Student> saveStudents(List<Student> students) {
    return repo.saveAll(students);
  }

  public Student getStudentById(Integer id) {
    return repo.findById(id).orElse(null);
  }

  public Student getStudentByName(String name) {
    return repo.findByName(name);
  }

  public void deleteStudent(Integer id) {
    repo.deleteById(id);
  }

  public Student updateStudent(Student student) {
    return repo.save(student);
//    Student existingStudent = getStudentById(student.id);
//    if (existingStudent == null) return null;
//    existingStudent.name = student.name;
//    existingStudent.grade = student.grade;
//    return repo.save(existingStudent);
  }

  public List<Student> getStudents() {
    return repo.findAll();
  }
}
