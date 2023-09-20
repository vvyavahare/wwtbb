package org.wwtbb.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity(name = "questions")
@Builder
@AllArgsConstructor
@JsonIgnoreProperties
public class Question {
    @Id
    private Long id;
    private String questionString;
    private int score;
}
