package br.com.dgdgark.livraria.repository;

import br.com.dgdgark.livraria.model.livrariaModel;
import org.springframework.data.repository.CrudRepository;

public interface livrariaRepository extends CrudRepository<livrariaModel, String> {
}
