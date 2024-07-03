package pe.edu.cibertec.DSWII_T3_RIOS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_T3_RIOS.model.bd.Alumno;
import pe.edu.cibertec.DSWII_T3_RIOS.model.bd.Notas;
import pe.edu.cibertec.DSWII_T3_RIOS.model.bd.pk.AlumnoCursos;

@Repository
public interface NotasRepository extends JpaRepository<Notas, AlumnoCursos> {

}
