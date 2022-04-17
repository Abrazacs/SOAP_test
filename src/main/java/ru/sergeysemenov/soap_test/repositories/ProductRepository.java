package ru.sergeysemenov.soap_test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sergeysemenov.soap_test.entetis.ProductEntity;


@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {




}
