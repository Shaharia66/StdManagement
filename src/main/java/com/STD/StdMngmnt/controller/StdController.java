package com.STD.StdMngmnt.controller;

import com.STD.StdMngmnt.dto.StdResponseDto;
import com.STD.StdMngmnt.entity.Student;
import com.STD.StdMngmnt.repository.StdRepository;
import com.STD.StdMngmnt.service.StdService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StdController {
    private final StdService stdService;

    @GetMapping("/all")
    public List<StdResponseDto> getAllStudents() {
        return stdService.getAllStudents();
    }

    @GetMapping("/all/{id}")
    public StdResponseDto getStudentById(@PathVariable Long id) {
        return stdService.getStudentById(id);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello saif.";
    }

}
