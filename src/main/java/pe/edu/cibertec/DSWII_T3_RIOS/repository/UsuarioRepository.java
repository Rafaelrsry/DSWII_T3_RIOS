package pe.edu.cibertec.DSWII_T3_RIOS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_T3_RIOS.model.bd.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    //Select * from usuario where nomusuario = 'lsalvat'
    Usuario findByNomusuario(String nomusuario);
    //Select * from usuario where nombres = 'lsalvat'
    Usuario findByNombres(String nombres);

}
