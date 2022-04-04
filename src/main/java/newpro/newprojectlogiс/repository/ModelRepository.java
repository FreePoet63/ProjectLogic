package newpro.newprojectlogiс.repository;

import newpro.newprojectlogiс.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Long> {
}
