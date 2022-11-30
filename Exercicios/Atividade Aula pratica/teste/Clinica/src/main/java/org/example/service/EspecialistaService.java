package org.example.service;
import org.example.model.Especialista;
import org.example.repository.IEspecialistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // difine a classe como um bean da Spring
public class EspecialistaService {
    @Autowired
    private IEspecialistaRepository repository;

    public List<Especialista> findAll(){
        return repository.findAll();
    } // retorna uma lista com todas os pacientes

    public Especialista findOne(Long id){
        return repository.findOne(id);
    } // retorna uma clinica a partir do id informado

    public Especialista save (Especialista especialista){
        return repository.save(especialista);
    }  // salva ou atualiza um paciente

    public void delete (Long id){
        repository.delete(id);
    } // exclui paciente
}

