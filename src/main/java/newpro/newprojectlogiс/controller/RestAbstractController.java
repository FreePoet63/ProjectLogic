package newpro.newprojectlogiс.controller;

import newpro.newprojectlogiс.domain.ComboListItem;
import newpro.newprojectlogiс.dto.ListItemDto;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

public abstract class RestAbstractController<T extends ComboListItem, R extends JpaRepository<T, ?>> {
    protected R repository;

    public RestAbstractController(R repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<T> list(@PageableDefault Pageable pageable) {
        return repository.findAll(pageable);
    }

    @GetMapping("{id}")
    public T getOne(@PathVariable("id") T obj) {
        return obj;
    }

    @PostMapping
    public T add(@RequestBody T obj) {
        return repository.save(obj);
    }

    @PutMapping("{id}")
    public T update(@PathVariable("id") T dbObj, @RequestBody T obj) {
        BeanUtils.copyProperties(obj, dbObj, "id");
        return repository.save(dbObj);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") T dbObj) {
        repository.delete(dbObj);
    }

    @GetMapping("list")
    public List<ListItemDto> list() {
        return repository
                .findAll()
                .stream()
                .map(entity -> new ListItemDto(entity.getId(), entity.getName()))
                .collect(Collectors.toList());
    }
}
