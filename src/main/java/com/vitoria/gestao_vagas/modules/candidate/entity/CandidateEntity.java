package com.vitoria.gestao_vagas.modules.candidate.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public class CandidateEntity {

    private UUID id;
    @NotBlank(message = "O campo name e obrigatorio")
    private String name;

    @Email(message = "O campo email deve conter um email valido")
    @NotBlank(message = "O campo email e obrigatorio")
    private String email;

    @Size(min = 8, max = 20 , message = "O campo password deve ter entre 8 e 20 caracteres")
    @NotBlank(message = "O campo password e obrigatorio")
    private String password;

    private String description;
    private String curriculum;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

}
