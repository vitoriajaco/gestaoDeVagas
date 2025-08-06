package com.vitoria.gestao_vagas.candidate.entity;

import lombok.Data;

import java.util.UUID;
@Data
public class CandidateEntity {

    private UUID id;
    public String name;
    public String email;

    public String password;
    public String description;
    public String curriculum;


}
