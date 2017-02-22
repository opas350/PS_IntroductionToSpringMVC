package com.opas350.model;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

/**
 * Created by javier.reyes.valdez on 2/20/2017.
 */

@Data
public class Goal {
    @Range(min = 1, max = 120)
    private  int minutes;
}
