package com.att.microservice.learning.rest;

import com.att.microservice.learning.model.Lesson;
import com.att.microservice.learning.service.Learning;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value="/learning")

public class LearningController {

    @RequestMapping (value="/start")
    public Lesson startLearning(@RequestParam(value="studentName") String studentName){

        Learning lessonLearning =new Learning();
        Lesson firstLesson = lessonLearning.createFirstLesson(studentName);
        return firstLesson;
    }
}


