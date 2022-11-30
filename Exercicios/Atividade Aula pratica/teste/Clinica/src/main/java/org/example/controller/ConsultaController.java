package org.example.controller;
import org.example.model.Consulta;
import org.example.service.ClinicaService;
import org.example.service.ConsultaService;
import org.example.service.EspecialistaService;
import org.example.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;

@Controller
public class ConsultaController {

    @Autowired
    private EspecialistaService especialistaservice;
    @Autowired
    private ClinicaService clinicaservice;
    @Autowired
    private PacienteService pacienteservice;
    @Autowired
    private ConsultaService consultaservice;
    @GetMapping("/consulta")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView("/consulta");
        mv.addObject("consulta", consultaservice.findAll());
        return mv;
    }

    @GetMapping("/consultaAdd")
    public ModelAndView add(Consulta consulta){
        ModelAndView mv = new ModelAndView("/consultaaAdd");
        mv.addObject("paciente", pacienteservice.findAll());
        mv.addObject("clinica", clinicaservice.findAll());
        mv.addObject("especialista", especialistaservice.findAll());
        mv.addObject("consulta", consulta);
        return mv;
    }
    @GetMapping("/consultaEdit/{id}")
    public ModelAndView update(@PathVariable("id") long id){
        ModelAndView mv = new ModelAndView("/consultaEdit");
        mv.addObject("consulta", consultaservice.findOne(id));
        return mv;
    }
    @PostMapping("/consultaEdit")
    public ModelAndView update (@Valid Consulta consulta){
        consultaservice.save(consulta);
        return findAll();
    }

    @GetMapping("/deleteConsulta/{id}")
    public ModelAndView delete(@PathVariable("id")Long id) {
        consultaservice.delete(id);
        return findAll();
    }

    @PostMapping("/consultaSave")
    public ModelAndView save(@Valid Consulta consulta, BindingResult result){
        if (result.hasErrors()){
            return add(consulta);
        }
        consultaservice.save(consulta);
        return findAll();
    }
}
