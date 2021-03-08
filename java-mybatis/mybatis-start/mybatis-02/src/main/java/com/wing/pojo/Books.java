package com.wing.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

/**
 * @author memory125
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
    private int bkId;
    private String bkTitle;
    private Date year;
}
