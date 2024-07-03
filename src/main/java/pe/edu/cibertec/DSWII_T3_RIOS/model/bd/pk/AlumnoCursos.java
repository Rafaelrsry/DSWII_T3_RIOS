package pe.edu.cibertec.DSWII_T3_RIOS.model.bd.pk;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class AlumnoCursos implements Serializable {

    private String idalumno;
    private String idcurso;
}
