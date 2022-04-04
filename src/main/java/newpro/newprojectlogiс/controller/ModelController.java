package newpro.newprojectlogiс.controller;

import newpro.newprojectlogiс.domain.Model;
import newpro.newprojectlogiс.repository.ModelRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/model")
public class ModelController extends RestAbstractController<Model, ModelRepository>{
    public ModelController(ModelRepository repository) {
        super(repository);
    }
}
