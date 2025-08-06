package com.vitoria.gestao_vagas.candidate.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;
@Data
public class CandidateEntity {

    private UUID id;
    @Pattern(regexp = "^(?!\\s*$).+", message = "O campo name nao deve conter espaço")
    public String name;
    @Email(message = "O campo email deve conter um email valido")
    public String email;
    @Length(min = 10, max = 100)
    public String password;
    public String description;
    public String curriculum;

}
