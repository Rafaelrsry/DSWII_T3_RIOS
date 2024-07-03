package pe.edu.cibertec.DSWII_T3_RIOS.service;

import pe.edu.cibertec.DSWII_T3_RIOS.model.bd.Usuario;

public interface IUsuarioService {

    Usuario obtenerUsuarioPorNomUsuario(
            String nomusuario);
}
