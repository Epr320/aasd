package Biblioteca.Interfaces;

import Biblioteca.entidades.Reseña;
import org.springframework.stereotype.Component;

@Component
public interface ReseñaServicio {
    Reseña agregarReseña (String libroIsbn, String contenido) throws Exception;
}
