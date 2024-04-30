package com.projeto.pizzaria.repositories;

import com.projeto.pizzaria.models.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {

}
