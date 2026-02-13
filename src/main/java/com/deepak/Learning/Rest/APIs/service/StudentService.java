package com.deepak.Learning.Rest.APIs.service;

import com.deepak.Learning.Rest.APIs.dto.AddStudentRequestDto;
import com.deepak.Learning.Rest.APIs.dto.StudentDto;
import org.jspecify.annotations.Nullable;

import java.util.List;
import java.util.Map;                                                    ///     ISME SARA CONTROLLER KA SERVICE DEFINE KIYA GAYA HAI

public interface StudentService {

    List<StudentDto> getAllStudent();

    StudentDto getStudentById(Long id);

    @Nullable StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudentById(Long id);

    @Nullable StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);

    @Nullable StudentDto updatePartialStudent(Long id, Map<String, Object> updates);
}
