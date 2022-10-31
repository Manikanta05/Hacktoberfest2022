
package com.mani.todo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mani.todo.dto.TodoDTO;
import com.mani.todo.model.TodoModel;

@RestController
public class TodoController {
  //System.out.println("This is a controller");
  @GetMapping("/todo")
  public List<TodoModel> getTodos(){
	  //write your code here
	  return null;
  }
  @GetMapping("/todo/{id}")
  public TodoModel getTodo(@PathVariable int id){
	  //write your code here
	  return null;
  }
  @PostMapping("/todo")
  public void addTodo(@RequestBody TodoDTO todoDTO){
	  //write your code here	  
  }
  
}
