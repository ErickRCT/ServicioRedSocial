package com.cursomicro.users.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long user_id;
    private String name;
    private String lastName;
    private String cellPhone;
    private List<PostDto> posts;
}
