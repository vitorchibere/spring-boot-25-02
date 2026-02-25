package com.vhc.school.controllers;

import com.vhc.school.models.AlunoModel;
import com.vhc.school.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/alunos")

public class AlunoControllers {
    @Autowired
    private AlunoService alunoService;
    @PostMapping
    public AlunoModel criarAluno(@RequestBody AlunoModel alunoModel){
        return alunoService.criarAluno(alunoModel);
    }
    @GetMapping
    public List<AlunoModel> buscarTodosAlunos (){
        return alunoService.buscarTodosAlunos();
    }
    @

    public void deletarAluno(Long id){
        alunoService.deletarAluno(id);
    }
}
