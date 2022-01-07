package com.mitocode.repo;

import com.mitocode.model.ConsultaExamen;
import com.mitocode.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IUsuario extends JpaRepository<Usuario, Integer> {

        //@Transactional

        @Query("Select ce from Usuario ce where ce.username = :nombre OR ce.password = :clave")
        Optional<Usuario> Buscar(@Param("nombre") String nombre, @Param("clave") String clave);

    }

