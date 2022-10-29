package org.example.controller;
import org.example.model.Especialista;
import org.example.service.EspecialistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;

@Controller
public class EspecialistaController {
        @Autowired
        private EspecialistaService service; // injeta a classe de serviços

        @GetMapping("/especialista")
        public ModelAndView findAll() {
            ModelAndView mv = new ModelAndView("/especialista");
            mv.addObject("especialista", service.findAll());
            return mv;
        }

        @GetMapping("/especialistaAdd")
        public ModelAndView add (Especialista especialista){
            ModelAndView mv = new ModelAndView("/pacienteAdd");
            mv.addObject("especialistas", service.findAll());
            mv.addObject("especialista", especialista);
            return mv;
        }
    @GetMapping("/especialistaEdit/{id}")
    public ModelAndView update (@PathVariable("id") long id){
        ModelAndView mv = new ModelAndView("/especialistaEdit");
        mv.addObject("especialista", service.findOne(id));
        return mv;
    }

    @GetMapping("/deleteEspecialista/{id}")
    public ModelAndView delete(@PathVariable("id")Long id) {
        service.delete(id);

        return findAll();
    }
        @PostMapping("/especialistaSave")
        public ModelAndView save(@Valid Especialista especialista, BindingResult result){
            if (result.hasErrors()){
                return add(especialista);
            }
            service.save(especialista);
            return findAll();
        }
    }


