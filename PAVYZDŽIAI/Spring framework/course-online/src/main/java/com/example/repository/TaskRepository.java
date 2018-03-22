package com.example.repository;

import com.example.entity.Task;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Marius on 2/16/2017.
 */
public interface TaskRepository extends CrudRepository<Task, Integer>{
}
