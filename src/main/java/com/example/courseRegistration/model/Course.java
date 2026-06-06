package com.example.courseRegistration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private  int id;
	 private String CourseName;
	 private String Trainer;
	 private int durationInWeek;
	 
	 public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCourseName() {
			return CourseName;
		}
		public void setCourseName(String courseName) {
			CourseName = courseName;
		}
		public String getTrainer() {
			return Trainer;
		}
		public void setTrainer(String trainer) {
			Trainer = trainer;
		}
		public int getDurationInWeek() {
			return durationInWeek;
		}
		public void setDurationInWeek(int durationInWeek) {
			this.durationInWeek = durationInWeek;
		}
	 
	 
}
