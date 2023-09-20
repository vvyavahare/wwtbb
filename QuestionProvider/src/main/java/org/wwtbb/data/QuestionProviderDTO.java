package org.wwtbb.data;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@JsonIgnoreProperties
public class QuestionProviderDTO implements Serializable {
    private Long id;
    private String questionString;
    private int score;
}
