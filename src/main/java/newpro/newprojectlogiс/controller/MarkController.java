package newpro.newprojectlogiс.controller;

import newpro.newprojectlogiс.domain.Mark;
import newpro.newprojectlogiс.repository.MarkRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mark")
public class MarkController extends RestAbstractController<Mark, MarkRepository>{
    public MarkController(MarkRepository repository) {
        super(repository);
    }
}
