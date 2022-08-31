package Biblioteca.Repositorios;

import Biblioteca.entidades.Autor;
import Biblioteca.entidades.Libro;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepo extends JpaRepository<Autor, String> {
}
