/**
 * Created by javier.reyes.valdez on 2/17/2017.
 */
package com.opas350.model;

import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@Data
public class Exercise {

    @Range(min = 1, max = 120)
    private int minutes;
    @NotNull
    private String activity;
}
