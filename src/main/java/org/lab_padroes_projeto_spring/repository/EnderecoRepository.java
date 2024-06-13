package org.lab_padroes_projeto_spring.repository;

import org.lab_padroes_projeto_spring.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String>{

}
