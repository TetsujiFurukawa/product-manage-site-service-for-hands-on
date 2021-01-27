package com.example.demo.entity.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SignInRequestDto {

  @NotNull
  @Size(max = 100)
  private String Username;

  @NotNull
  @Size(max = 100)
  private String Password;

}
