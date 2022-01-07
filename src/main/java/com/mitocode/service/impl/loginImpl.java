package com.mitocode.service.impl;

import com.mitocode.model.Consulta;
import com.mitocode.model.Usuario;
import com.mitocode.repo.IMedicoRepo;
import com.mitocode.repo.IUsuario;
import com.mitocode.service.Ilogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class loginImpl implements Ilogin {

    @Autowired
    private IUsuario repo;


    @Override
    public boolean Buscar(Usuario usuario) {
        Optional<Usuario> op = repo.Buscar(usuario.getUsername(),usuario.getPassword());
        return op.isPresent() ? true : false;

    }
}
