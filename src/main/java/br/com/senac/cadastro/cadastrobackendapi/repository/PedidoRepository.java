package br.com.senac.cadastro.cadastrobackendapi.repository;

import br.com.senac.cadastro.cadastrobackendapi.modelo.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}