package com.flouci.application1.repository;

import org.springframework.data.repository.CrudRepository;

import com.flouci.application1.model.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
