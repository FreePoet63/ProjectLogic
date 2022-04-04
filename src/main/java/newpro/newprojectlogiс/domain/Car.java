package newpro.newprojectlogiс.domain;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Car implements ComboListItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToOne
    @JsonIdentityReference(alwaysAsId = true)
    @JsonSerialize(as = ComboListItem.class)
    private Model model;
}