package org.formacio.repositori;

import org.formacio.domain.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PersonaRepository extends CrudRepository<Persona, Long> {

	@Query(value="select persona from Persona persona join fetch persona.propietats where persona.id = :id")
	Persona carrega(@Param("id") long id);

}
