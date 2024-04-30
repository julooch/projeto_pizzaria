package com.projeto.pizzaria.repositories;

import com.projeto.pizzaria.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
