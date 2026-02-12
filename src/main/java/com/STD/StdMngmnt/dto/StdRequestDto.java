package com.STD.StdMngmnt.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StdRequestDto {
    @NotEmpty(message="asksk dscn jdsnj.")
    @Size(min =4,max=35,message = "jashbbjwhhswv")
    private String name;
    @Email
    @NotEmpty(message ="not found msg")
    private String email;
}