package edu.cit.agramon.vicci.campusequimentloan.user.Controller;

import edu.cit.agramon.vicci.campusequimentloan.student.Entity.studentEntity;
import edu.cit.agramon.vicci.campusequimentloan.user.Entity.userEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import edu.cit.agramon.vicci.campusequimentloan.user.Repo.userRepo;
import edu.cit.agramon.vicci.campusequimentloan.user.Service.userService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class userController {
    @Autowired
    private userService userService;
    @Autowired
    private userRepo userRepo;


    @PostMapping("/register")
    public String register(@RequestBody studentEntity student){
        String response = userService.createStudent(student.getUserName(), student.getPassword(), student.getEmail(), student.getStudentNo(), student.getName());
        return response;
    }
    @PostMapping("/loginStudent")
    public String login(@RequestBody userEntity user){

        String response = userService.login(user.getEmail(), user.getPassword());
        return response;
    }
    
    
}
