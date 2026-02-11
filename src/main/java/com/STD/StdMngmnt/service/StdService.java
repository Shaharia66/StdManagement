package com.STD.StdMngmnt.service;

import com.STD.StdMngmnt.dto.StdResponseDto;
import com.STD.StdMngmnt.entity.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface StdService {
    List<StdResponseDto> getAllStudents();
    StdResponseDto getStudentById(Long id);
}
