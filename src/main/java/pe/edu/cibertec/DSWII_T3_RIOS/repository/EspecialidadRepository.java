package pe.edu.cibertec.DSWII_T3_RIOS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_T3_RIOS.model.bd.Especialidad;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, String> {
}
