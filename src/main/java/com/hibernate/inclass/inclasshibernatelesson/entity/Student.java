package com.hibernate.inclass.inclasshibernatelesson.entity;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT_TABLE_TEST")
public class Student {

  @Id
  @GeneratedValue
  public int id;
  @Column(name = "name")
  public String name;
  @Column(name = "grade")
  public double grade;
}
