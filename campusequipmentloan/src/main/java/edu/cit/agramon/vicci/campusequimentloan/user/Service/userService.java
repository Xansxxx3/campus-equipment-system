package edu.cit.agramon.vicci.campusequimentloan.user.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import edu.cit.agramon.vicci.campusequimentloan.student.Entity.studentEntity;
import edu.cit.agramon.vicci.campusequimentloan.user.Entity.AccountType;
import edu.cit.agramon.vicci.campusequimentloan.user.Entity.userEntity;
import edu.cit.agramon.vicci.campusequimentloan.user.Repo.userRepo;
import org.springframework.stereotype.Service;

@Service
public class userService {


    @Autowired
    private userRepo userrepo;
    @Autowired
    private PasswordEncoder passwordEncoder;


    public String createStudent(String userName, String password, String email, String studentNo, String name) {
        // Check if a student with the same studentNo already exists
        Optional<userEntity> existingUser = userrepo.findByEmail(email);

        if (existingUser.isPresent()) {
            return "Student with email " + email + " already exists.";
        }
        System.out.print(userName);
        System.out.println(password);
        // Create and populate a new student entity
        studentEntity student = new studentEntity();
        student.setStudentNo(studentNo);
        student.setName(name);
        student.setEmail(email);
        student.setUserName(userName);
        student.setPassword(passwordEncoder.encode(password));
        student.setEmail(email);
        student.setAccountType(AccountType.STUDENT);

        // Save the new student entity to the database
        userrepo.save(student);

        System.out.print("Student successfully created. Student No: " + userName + ", Name: " + name);
        // Return success message
        return "Student successfully created. Student No: " + userName + ", Name: " + name;
    }

    public String login(String email, String password) {
        System.out.println("Login attempt: " + email);

        userEntity foundUser = userrepo.findByEmail(email)
                .orElseThrow(() -> {
                    System.out.println("User not found: " + email);
                    return new UsernameNotFoundException("User not found with email: " + email);
                });

        System.out.println("User found: " + foundUser.getEmail());
        System.out.println("Stored password hash: " + foundUser.getPassword());

        if (passwordEncoder.matches(password, foundUser.getPassword())) {
            System.out.println("Password matched");
            return "Successfully logged in";
        } else {
            System.out.println("Password did not match");
            return "Invalid credentials: password does not match.";
        }
    }


    public List<userEntity> getAllUser(){
        return userrepo.findAll();
    }
    
}
