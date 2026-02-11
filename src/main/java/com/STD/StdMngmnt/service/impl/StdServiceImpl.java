package com.STD.StdMngmnt.service.impl;

import com.STD.StdMngmnt.dto.StdRequestDto;
import com.STD.StdMngmnt.dto.StdResponseDto;
import com.STD.StdMngmnt.entity.Student;
import com.STD.StdMngmnt.repository.StdRepository;
import com.STD.StdMngmnt.service.StdService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class StdServiceImpl implements StdService {
    private final StdRepository stdRepository;
    @Override
    public List<StdResponseDto> getAllStudents() {
        List<Student> students = stdRepository.findAll();
        List<StdResponseDto> std = students
                .stream()
                .map(s -> new StdResponseDto(
                        s.getId(),
                        s.getName(),
                        s.getEmail()))
                .toList();
        return std;
    }

    @Override
    public StdResponseDto getStudentById(Long id) {
        Student student = stdRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("std not found " + id));

        StdResponseDto s= new StdResponseDto(
                student.getId(),
                student.getName(),
                student.getEmail());
        return s;
    }

    @Override
    public StdResponseDto createNewStd(StdRequestDto dto) {
        Student s= new Student();
        s.setName(dto.getName());
        s.setEmail(dto.getEmail());
        Student std = stdRepository.save(s);
        return new StdResponseDto(
                std.getId(),
                std.getName(),
                std.getEmail()
        );
    }
}



