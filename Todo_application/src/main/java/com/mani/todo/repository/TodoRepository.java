package com.mani.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mani.todo.model.TodoModel;

@Repository
public interface TodoRepository extends JpaRepository<TodoModel, Integer> {

}
