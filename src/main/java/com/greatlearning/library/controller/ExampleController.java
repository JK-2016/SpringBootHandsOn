package com.greatlearning.library.controller;

import com.greatlearning.library.model.GreatLearning;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class ExampleController {
    @GetMapping("/info")
//    @ResponseBody
    public GreatLearning get(){
        GreatLearning gl = new GreatLearning();
        gl.setCourseName("Spring APIs");
        gl.setCourseType("Backend Development");
        gl.setCourseTutor("JK-Rest");
        return gl;
    }
    @GetMapping("/Hello")
    public String getHello(){
        return "Hello World!!!";
    }

    @PostMapping("customInfo")
    public GreatLearning customInfo(String courseName,String courseType, String courseTutor){
        GreatLearning gl = new GreatLearning();
        gl.setCourseName(courseName);
        gl.setCourseType(courseType);
        gl.setCourseTutor(courseTutor);
        return gl;
    }
}
