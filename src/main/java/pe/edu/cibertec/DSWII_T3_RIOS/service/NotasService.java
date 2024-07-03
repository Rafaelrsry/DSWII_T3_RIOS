package pe.edu.cibertec.DSWII_T3_RIOS.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_RIOS.model.bd.Notas;
import pe.edu.cibertec.DSWII_T3_RIOS.repository.NotasRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class NotasService implements  INotasService{

    private  NotasRepository notasRepository;

    @Override
    public List<Notas> listarNotas() {
        return  notasRepository.findAll();
    }
}
