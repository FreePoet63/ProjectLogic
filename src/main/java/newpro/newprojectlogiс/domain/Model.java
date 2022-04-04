package newpro.newprojectlogiс.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import newpro.newprojectlogiс.util.EntityResolver;

import javax.persistence.*;

@Data
@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        scope = Model.class,
        resolver = EntityResolver.class,
        property = "id"
)
public class Model implements ComboListItem{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToOne
    @JsonIdentityReference(alwaysAsId = true)
    private Mark mark;
}
