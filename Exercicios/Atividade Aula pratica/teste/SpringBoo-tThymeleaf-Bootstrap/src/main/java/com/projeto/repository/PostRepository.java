package com.projeto.repository;

import com.projeto.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {}
// Deve estender JpaRepository e declarar a entidade (Post) e o tipo de chave primária (Long)