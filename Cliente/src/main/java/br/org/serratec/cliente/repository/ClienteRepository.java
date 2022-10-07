package br.org.serratec.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.cliente.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
