package com.STD.StdMngmnt.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StdResponseDto {
    private Long id;
    private String name;
    private String email;
}
