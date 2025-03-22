package br.com.maicon.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maicon.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

    
    

}
