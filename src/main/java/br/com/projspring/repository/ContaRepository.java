package br.com.projspring.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.projspring.model.Conta;

public interface ContaRepository extends CrudRepository<Conta, Long> {

}