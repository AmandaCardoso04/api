package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Cadastro;

public interface cadastroRepository extends JpaRepository<Cadastro, Long>{
}