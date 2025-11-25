package br.com.dio.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserModel {
    private int code;
    private String userName;
    private LocalDate birthday;
}
