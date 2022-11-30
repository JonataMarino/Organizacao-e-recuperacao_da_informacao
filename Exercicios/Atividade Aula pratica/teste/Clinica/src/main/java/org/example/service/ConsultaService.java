package org.example.service;
import org.example.model.Consulta;
import org.example.repository.IConsultaRepository;
import org.example.repository.IEspecialistaRepository;
import org.example.repository.IPacienteRepository;
import org.example.repository.IClinicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConsultaService {
    @Autowired
    private IConsultaRepository repository; // injeta o repositório
    @Autowired
    private IEspecialistaRepository especialistarepository;
    @Autowired
    private IPacienteRepository pacienterepository;
    @Autowired
    private IClinicaRepository clinicarepository;


    public List<Consulta> findAll(){
        return repository.findAll();
    }

    public Consulta findOne(Long id){
        return repository.findOne(id);
    }

    public Consulta save (Consulta consulta){
        return repository.save(consulta);
    }

    public void delete (Long id){
        repository.delete(id);
    }
}

