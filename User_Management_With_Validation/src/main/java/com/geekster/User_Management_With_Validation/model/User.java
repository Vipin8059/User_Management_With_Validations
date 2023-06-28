package com.geekster.User_Management_With_Validation.model;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NotNull
    Integer userId;

    @NotBlank(message = "name cannot be blank")
    String userName;

    @NotNull
    LocalDate dateOfBirth;

    @Email(message = "Given email id is invalid")
    String email;

    @Pattern(regexp = "\\d{2}-\\d{10}")
    String phoneNumber;

    @NotNull
    LocalDate date;

    @NotNull
    LocalTime time;

}
