package ru.sergeysemenov.soap_test.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sergeysemenov.soap_test.repositories.CategoryRepository;


@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

}
