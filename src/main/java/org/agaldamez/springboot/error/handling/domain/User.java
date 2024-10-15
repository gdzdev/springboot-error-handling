package org.agaldamez.springboot.error.handling.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String username;
    private String password;

    private Role role;

    public User (Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

}
