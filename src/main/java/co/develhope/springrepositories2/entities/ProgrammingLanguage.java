package co.develhope.springrepositories2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String name;
    private Integer firstAppearence;
    @Column(nullable = false)
    private String inventor;

}