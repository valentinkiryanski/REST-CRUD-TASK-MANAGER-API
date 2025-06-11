
package com.rest_crud_api.task_manager.repo;

import com.rest_crud_api.task_manager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<Task,Integer> {


}