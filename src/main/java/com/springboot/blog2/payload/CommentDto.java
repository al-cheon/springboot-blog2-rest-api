package com.springboot.blog2.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data @AllArgsConstructor @NoArgsConstructor
public class CommentDto {
    private long id;

    @NotEmpty(message = "Name should not be null or empty")
    private String name;

    @NotEmpty(message = "Email should not be null or empty")
    @Email
    private String email;

    @NotEmpty(message = "Comment should not be null or empty")
    @Size(min = 10, message = "Comment body must be mininum 10 characters")
    private String body;
}
