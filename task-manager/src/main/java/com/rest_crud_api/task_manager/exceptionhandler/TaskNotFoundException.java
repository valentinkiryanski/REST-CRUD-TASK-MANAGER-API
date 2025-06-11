package com.rest_crud_api.task_manager.exceptionhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;

public class TaskNotFoundException extends RuntimeException{

    public TaskNotFoundException(String message) {
        super(message);
    }
}
