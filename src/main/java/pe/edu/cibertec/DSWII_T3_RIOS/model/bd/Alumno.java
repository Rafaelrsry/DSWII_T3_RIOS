package pe.edu.cibertec.DSWII_T3_RIOS.model.bd;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import pe.edu.cibertec.DSWII_T3_RIOS.model.bd.pk.AlumnoCursos;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "alumno")
public class Alumno {
    @Id
    private String idalumno;
    @Column(name = "apealumno")
    private String apealumno;
    @Column(name = "nomalumno")
    private String nomalumno;
    @OneToOne
    @JoinColumn(name = "idesp")
    private Especialidad especialidad;
    @Column(name = "proce")
    private String proce;


    @OneToMany(mappedBy = "alumno",
            cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private Set<Notas> curso = new HashSet<>();

}
