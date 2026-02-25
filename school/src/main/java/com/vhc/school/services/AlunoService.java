package com.vhc.school.services;

import com.vhc.school.models.AlunoModel;
import com.vhc.school.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public AlunoModel criarAluno(){
        Object alunoModel;
        return alunoRepository.save(AlunoModel alunoModel);
    }

    public List<AlunoModel> buscarTodosAlunos (){
        return alunoRepository.findAll();
    }

    public void deletarAluno(Long id){
        alunoRepository.deleteById(id);
    }
}