package newpro.newprojectlogiс.repository;

import newpro.newprojectlogiс.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
