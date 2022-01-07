package com.mitocode.controller;

import com.mitocode.model.Examen;
import com.mitocode.model.Medico;
import com.mitocode.model.Usuario;
import com.mitocode.repo.IUsuario;
import com.mitocode.service.IMedicoService;
import com.mitocode.service.Ilogin;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private Ilogin service;

    @PostMapping
    public ResponseEntity<Boolean> buscar( @RequestBody Usuario usuario) {
        boolean e = service.Buscar(usuario);
        System.out.println(e);
        return new ResponseEntity <Boolean>(e, HttpStatus.OK);
    }

}
