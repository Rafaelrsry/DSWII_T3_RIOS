package pe.edu.cibertec.DSWII_T3_RIOS.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import pe.edu.cibertec.DSWII_T3_RIOS.model.dto.ArchivoDto;
import pe.edu.cibertec.DSWII_T3_RIOS.service.FileService;

import java.util.List;

@PreAuthorize("hasRole('ADMIN')")
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/files")
public class FileController {

    private final FileService fileService;

    @PostMapping("")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<ArchivoDto> subirArchivos(
            @RequestParam("files") List<MultipartFile> multipartFileList
    ) throws Exception {
        // Validar las extensiones de los archivos
        for (MultipartFile file : multipartFileList) {
            String fileName = file.getOriginalFilename();
            long fileSize = file.getSize();
            if (fileName == null || !fileName.endsWith(".docx")) {
                return new ResponseEntity<>(ArchivoDto.builder()
                        .mensaje("Solo se permiten archivos con extensión .docx").build(),
                        HttpStatus.BAD_REQUEST);
            }

            if (fileSize > 2 * 1024 * 1024) { // 2 MB en bytes
                return new ResponseEntity<>(ArchivoDto.builder()
                        .mensaje("El tamaño del archivo no debe superar los 2 MB").build(),
                        HttpStatus.BAD_REQUEST);
            }
        }

        // Guardar los archivos si la validación es correcta
        fileService.guardarArchivos(multipartFileList);
        return new ResponseEntity<>(ArchivoDto.builder()
                .mensaje("Archivos subidos correctamente").build(),
                HttpStatus.OK);
    }


}
