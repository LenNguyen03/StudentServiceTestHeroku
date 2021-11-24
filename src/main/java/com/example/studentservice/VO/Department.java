package com.example.studentservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private long Id;
    private String deparmentName;
    private String deparmentAddress;
    private String deparmentCode;
}
