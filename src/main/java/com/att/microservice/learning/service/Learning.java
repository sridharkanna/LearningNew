package com.att.microservice.learning.service;

import com.att.microservice.learning.model.Lesson;

public class Learning {


    public Lesson createFirstLesson(String studentName) {

        Lesson firstLesson= new Lesson();

        firstLesson.setStudentName(studentName);

        firstLesson.setCurrentChapter(1);

        firstLesson.setLessonTitle("First Lesson");

        return firstLesson;
    }
}
