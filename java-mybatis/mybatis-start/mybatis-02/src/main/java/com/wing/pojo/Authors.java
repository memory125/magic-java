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
public class Authors {
    private int authorId;
    private String authorName;
    private char authorGender;
}
