package com.example.demo.StudentPackage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRepository
        extends JpaRepository<Student, Long> {


    List<Student>
    findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCaseOrPhonenumberContaining(
            String firstName,
            String lastName,
            String phonenumber
    );
    // For example, the search query will be "alex":
    // In database: WHERE first_name LIKE '%alex%'
    //              OR last_name LIKE '%alex%'
    //              OR phonenumber LIKE '%alex%'
}
