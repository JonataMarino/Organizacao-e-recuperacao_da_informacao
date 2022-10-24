package org.example.service;


import org.example.repository.ClinicaRepository;
import org.example.model.Clinica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Define a classe como um bean do Spring
public class ClinicaService {

    @Autowired
    private ClinicaRepository repository; // injeta o repositório

    public List<Clinica> findAll(){
        return repository.findAll();
    } // retorna uma lista com todas as clinicas inseridas

   public Clinica findOne(Long id){
        return repository.findOne(id);
    } // retorna uma clinica a partir do id informado

    public Clinica save (Clinica clinica){
        return repository.saveAndFlush(clinica);
    }  // salva ou atualiza uma clinica

    public void delete (Long id){
        repository.delete(id);
    } // exclui uma clinica
}
