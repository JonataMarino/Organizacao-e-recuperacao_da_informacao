    package org.example.service;
    import org.example.repository.IClinicaRepository;
    import org.example.model.Clinica;
    import org.example.repository.IEnderecoRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    import java.util.List;

    @Service //Define a classe como um bean do Spring
    public class ClinicaService {

        @Autowired
        private IClinicaRepository repository; // injeta o repositório
        @Autowired
        private IEnderecoRepository enderecoRepository; // injeta o repositório

        public List<Clinica> findAll(){
            return repository.findAll();
        } // retorna uma lista com todas as clinicas inseridas

       public Clinica findOne(Long id){
            return repository.findOne(id);
        } // retorna uma clinica a partir do id informado

        public Clinica save (Clinica clinica){
            enderecoRepository.save(clinica.getEndereco());
            return repository.save(clinica);
        }  // salva ou atualiza uma clinica

        public void delete (Long id){
            repository.delete(id);
        } // exclui uma clinica
    }
