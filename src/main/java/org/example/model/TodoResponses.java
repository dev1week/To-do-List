package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TodoResponses {
    private Long id;
    private String title; 
    private Long order; 
    private Boolean completed; 
    private String url; 
    
    public TodoResponses(TodoEntity todoEntity){
        this.id = todoEntity.getId();
        this.title = todoEntity.getTitle();
        this.order = todoEntity.getOrder();
        this.completed =todoEntity.getCompleted();

        this.url = "http://localhost:8080/" + this.id;
    }
}
