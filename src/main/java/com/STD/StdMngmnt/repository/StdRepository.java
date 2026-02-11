package com.STD.StdMngmnt.repository;


import com.STD.StdMngmnt.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StdRepository extends JpaRepository<Student, Long> {

}
