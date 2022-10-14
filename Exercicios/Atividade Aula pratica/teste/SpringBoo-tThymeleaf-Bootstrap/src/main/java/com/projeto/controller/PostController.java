package com.projeto.controller;


import com.projeto.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.projeto.service.PostService;

import javax.validation.Valid;

@Controller //define a classe como um bean do Spring

public class PostController {

        @Autowired
        private PostService service; //Injeta a classe de serviços


    //Vai para tela principal do CRUD onde são listados todos os posts
        @GetMapping("/")
        public ModelAndView findAll() {
            ModelAndView mv = new ModelAndView("/post");
            mv.addObject("posts", service.findAll());

            return mv;
        }

        //Vai para a tela de adição de posts

    @GetMapping("/postAdd")
    public ModelAndView add(Post post){
        ModelAndView mv = new ModelAndView("/postAdd");
            mv.addObject("posts", post);

            return mv;
    }

    //vai para a tela de edição de post (mesma tela de edição, contudo é enviado para a view um objeto que já
    //existe
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id")Long id) {
            service.delete(id);

            return findAll();
    }
    //Recebe um objeto preenchido do thymeleaf e valida
    //se tudo estiver ok, salva e volta para a tela principal
    //se houver erro volta para a tela atual

    @PostMapping("/save")

    public ModelAndView save(@Valid Post post, BindingResult result) {
            if (result.hasErrors()) {
                return add(post);
            }
           service.save(post);

           return findAll();
    }

}
