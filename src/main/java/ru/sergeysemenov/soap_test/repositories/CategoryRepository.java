package ru.sergeysemenov.soap_test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sergeysemenov.soap_test.entetis.CategoryEntity;



@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

}