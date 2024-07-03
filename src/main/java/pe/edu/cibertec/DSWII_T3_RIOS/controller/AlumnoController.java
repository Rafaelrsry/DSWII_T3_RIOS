package pe.edu.cibertec.DSWII_T3_RIOS.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_T3_RIOS.model.bd.Alumno;
import pe.edu.cibertec.DSWII_T3_RIOS.service.IAlumnoService;

import java.util.List;

@PreAuthorize("hasRole('SUPERVISOR')")
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/alumnos")
public class AlumnoController {


    private IAlumnoService iAlumnoService;

    @GetMapping("")
    public ResponseEntity<List<Alumno>> listarAlumnos(){
        List<Alumno> alumnosList = iAlumnoService.listarAlumnos();
        if(alumnosList.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(alumnosList);
    }
}
