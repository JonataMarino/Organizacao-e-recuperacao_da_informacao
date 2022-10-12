package service;

import model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PostRepository;

import java.util.List;

@Service //Define a classe como um bean do Spring
public class PostService{

    @Autowired
    private PostRepository repository; // Injeta o repositório

    public List<Post> findAll(){
        return repository.findAll();
    } //Retorna uma lista com todos os posts inseridos

    public Post findOne(Long id){
        return repository.findOne(id);
    } // retorna um post à partir do id informado

    public Post save(Post post){
        return repository.saveAndFlush(post);
    } //salva ou atualiza um post

    public void delete(Long id){
        repository.delete(id);
    } //exclui um post

}