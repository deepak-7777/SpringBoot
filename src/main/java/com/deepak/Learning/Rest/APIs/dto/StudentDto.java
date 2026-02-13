package com.deepak.Learning.Rest.APIs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                         ///    ye constructor ke jagah pe use kiya gaya hai aur ye getter aur setter bhi banayega
@AllArgsConstructor           ///   ye sabhi constructor bana dega
@NoArgsConstructor
public class StudentDto {
    private Long id;
    private String name;
    private String email;

}
