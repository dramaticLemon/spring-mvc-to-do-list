package com.join.tab.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.join.tab.domen.Task;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class TaskRepository {

	@PersistenceContext
    private EntityManager entityManager;
	
	@Transactional
	public void save(Task task) {
		entityManager.persist(task);
	}

	public void deleteTask(int id) {
		// logic delete
	}

	public Task updateTask(Task task) {
		// update logic
		return null;
	}

	public Task getTask(int id) {
		return null;
	}

	public List<Task> getAllTask() {
		return null;
	}
}
