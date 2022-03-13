package homeWork.HW30.repository;

import homeWork.HW30.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}