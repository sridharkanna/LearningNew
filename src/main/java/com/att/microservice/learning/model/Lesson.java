package com.att.microservice.learning.model;

public class Lesson {

    String lessonTitle;
    int currentChapter;
    String studentName;

    public String getLessonTitle()
    {
        //getting the lessonTitle variable instance
        return lessonTitle;
    }

    public int getCurrentChapter()
    {
        //getting the currentChapter variable instance
        return currentChapter;
    }

    public String getStudentName()
    {
        //getting the studentName variable instance
        return studentName;
    }

    public void setLessonTitle(String lessonTitle)
    {
        //setting the lessonTitle variable value
        this.lessonTitle = lessonTitle;
    }

    public void setCurrentChapter(int currentChapter)
    {
        //setting the lessonTitle variable value
        this.currentChapter = currentChapter;
    }
    public void setStudentName(String studentName)
    {
        //setting the lessonTitle variable value
        this.studentName = studentName;
    }

}

