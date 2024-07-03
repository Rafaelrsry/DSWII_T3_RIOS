package pe.edu.cibertec.DSWII_T3_RIOS.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import pe.edu.cibertec.DSWII_T3_RIOS.model.bd.Curso;

import java.util.List;

@Data
public class NotasDto implements  DtoEntity{

    private Double exaparcial;
    private Double exafinal;


    private String nomcurso;
    private String nomalumno;
    private String apealumno;



}
