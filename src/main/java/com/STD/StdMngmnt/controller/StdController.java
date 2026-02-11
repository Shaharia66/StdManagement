package com.STD.StdMngmnt.controller;

import com.STD.StdMngmnt.dto.StdRequestDto;
import com.STD.StdMngmnt.dto.StdResponseDto;
import com.STD.StdMngmnt.entity.Student;
import com.STD.StdMngmnt.repository.StdRepository;
import com.STD.StdMngmnt.service.StdService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StdController {
    private final StdService stdService;

    @GetMapping("/get")
    public List<StdResponseDto> getAllStudents() {
        return stdService.getAllStudents();
    }

    @GetMapping("/get/{id}")
    public StdResponseDto getStudentById(@PathVariable Long id) {
        return stdService.getStudentById(id);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello saif.";
    }

    @PostMapping("/post")
    public ResponseEntity<StdResponseDto> createNewStd(@RequestBody StdRequestDto dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(stdService.createNewStd(dto));
    }
}
