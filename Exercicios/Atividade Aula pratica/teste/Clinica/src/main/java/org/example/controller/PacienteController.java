package org.example.controller;

import org.example.model.Paciente;
import org.example.service.ClinicaService;
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
public class PacienteController {

    @Autowired
    private PacienteService service; // injeta a classe de serviços

    @Autowired
    private ClinicaService clinicaService;

    @GetMapping("/paciente")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView("/paciente");
        mv.addObject("paciente", service.findAll());
        return mv;
    }
    @GetMapping("/deletePaciente/{id}")
    public ModelAndView delete(@PathVariable("id")Long id) {
        service.delete(id);

        return findAll();
    }
    @GetMapping("/pacienteAdd")
    public ModelAndView add (Paciente paciente){
        ModelAndView mv = new ModelAndView("/pacienteAdd");
        mv.addObject("clinicas", clinicaService.findAll());
        mv.addObject("paciente", paciente);
        return mv;
    }
    @GetMapping("/pacienteEdit/{id}")
    public ModelAndView update (@PathVariable("id") long id){
        ModelAndView mv = new ModelAndView("/pacienteEdit");
        mv.addObject("paciente", service.findOne(id));
        return mv;
    }
    @PostMapping("/pacienteSave")
    public ModelAndView save(@Valid Paciente paciente, BindingResult result, long clinica){
        if (result.hasErrors()){
            return add(paciente);
        }
        service.save(paciente);
        return findAll();
    }
}

