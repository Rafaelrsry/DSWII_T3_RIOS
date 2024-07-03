package pe.edu.cibertec.DSWII_T3_RIOS.model.bd;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.edu.cibertec.DSWII_T3_RIOS.model.bd.pk.AlumnoCursos;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name = "notas")
public class Notas {

    @EmbeddedId
    private AlumnoCursos id;
    private Double exaparcial;
    private Double exafinal;


    @ManyToOne
    @MapsId("idcurso")
    @JoinColumn(name = "idcurso")
    @JsonBackReference
    private Curso curso;


    @ManyToOne
    @MapsId("idalumno")
    @JoinColumn(name = "idalumno")
    @JsonBackReference
    private Alumno alumno;




}
