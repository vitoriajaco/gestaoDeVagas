package com.vitoria.gestao_vagas.modules.candidate.controller;

import com.vitoria.gestao_vagas.modules.candidate.entity.CandidateEntity;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping({"", "/"})
    public ResponseEntity<String> create(@Valid @RequestBody CandidateEntity candidateEntity){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Candidate " + candidateEntity.getEmail() + " created");
    }
}
