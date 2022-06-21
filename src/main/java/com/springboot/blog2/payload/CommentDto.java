package com.springboot.blog2.payload;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@ApiModel(description = "Comment model information")
@Data @AllArgsConstructor @NoArgsConstructor
public class CommentDto {

    @ApiModelProperty(value = "Comment id")
    private long id;

    @ApiModelProperty(value = "Comment name")
    @NotEmpty(message = "Name should not be null or empty")
    private String name;

    @ApiModelProperty(value = "Comment email")
    @NotEmpty(message = "Email should not be null or empty")
    @Email
    private String email;

    @ApiModelProperty(value = "Comment body")
    @NotEmpty(message = "Comment should not be null or empty")
    @Size(min = 10, message = "Comment body must be mininum 10 characters")
    private String body;
}
