package pe.edu.cibertec.DSWII_T3_RIOS.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_RIOS.model.bd.Alumno;
import pe.edu.cibertec.DSWII_T3_RIOS.repository.AlumnoRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class AlumnoService implements IAlumnoService{
    private AlumnoRepository alumnoRepository;

    @Override
    public List<Alumno> listarAlumnos() {
        return alumnoRepository.findAll();
    }
}
