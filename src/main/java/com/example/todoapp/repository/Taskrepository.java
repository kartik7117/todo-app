package com.example.todoapp.repository;

import com.example.todoapp.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Taskrepository extends JpaRepository<Task,Long> {
}
