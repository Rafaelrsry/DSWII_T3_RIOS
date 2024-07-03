package pe.edu.cibertec.DSWII_T3_RIOS.model.bd;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "curso")
public class Curso {
    @Id
    private String idcurso;
    @Column(name = "nomcurso")
    private String nomcurso;
    @Column(name = "credito")
    private Integer credito;

    @OneToMany(mappedBy = "curso",
            cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private Set<Notas> notas = new HashSet<>();
}
