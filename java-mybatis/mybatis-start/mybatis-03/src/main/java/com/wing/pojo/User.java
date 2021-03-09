package com.wing.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author memory125
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int userId;
    private String userName;
    private String password;
}
