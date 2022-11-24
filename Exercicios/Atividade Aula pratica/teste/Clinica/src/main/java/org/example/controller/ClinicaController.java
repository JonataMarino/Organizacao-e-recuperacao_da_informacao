package org.example.controller;

import org.example.model.Clinica;
import org.example.service.ClinicaService;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class ClinicaController {


    @Autowired
    private ClinicaService service; // injeta a classe de serviços

    //direciona para a tela principal da aplicação onde são listadas todas as clinicas
    @GetMapping("/")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView("/clinica");
        mv.addObject("clinica", service.findAll());
        return mv;
    }

    // Vai para a tela de adição de clinica
    @GetMapping("/clinicaAdd")
    public ModelAndView add(Clinica clinica) {
        ModelAndView mv = new ModelAndView("/clinicaAdd");
        mv.addObject("clinica", clinica);
        return mv;
    }

    @GetMapping("/clinicaEdit/{id}")
    public ModelAndView update (@PathVariable("id") long id){
        ModelAndView mv = new ModelAndView("/clinicaEdit");
        mv.addObject("clinica", service.findOne(id));
        return mv;
    }
    @PostMapping("/clinicaEdit")
    public ModelAndView update (@Valid Clinica clinica){
        service.save(clinica);
        return findAll();
    }


    @GetMapping("/delete/{id}")
   @Cascade(CascadeType.DELETE)
    public ModelAndView delete(@PathVariable("id") Long id) {
        service.delete(id);
        return findAll();
    }
    //recebe o objeto preenchido do thymeleaf e valida
    //se tudo estiver ok, salva e volta para a tela principal
    //se houver erro volta para a tela atual

    @PostMapping("/save")
    public ModelAndView save(@Valid Clinica clinica, BindingResult result) {
        if (result.hasErrors()) {
            return add(clinica);
        }
        service.save(clinica);
        return findAll();
    }
}

