package com.STD.StdMngmnt.service;

import com.STD.StdMngmnt.dto.StdRequestDto;
import com.STD.StdMngmnt.dto.StdResponseDto;

import java.util.List;

public interface StdService {
    List<StdResponseDto> getAllStudents();
    StdResponseDto getStudentById(Long id);
    StdResponseDto createNewStd(StdRequestDto dto);
    void deleteStudentById(Long id);
    StdResponseDto updateStudent(Long id, StdRequestDto dto);
}