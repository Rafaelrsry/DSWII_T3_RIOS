package pe.edu.cibertec.DSWII_T3_RIOS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_T3_RIOS.model.bd.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, String>{
}
