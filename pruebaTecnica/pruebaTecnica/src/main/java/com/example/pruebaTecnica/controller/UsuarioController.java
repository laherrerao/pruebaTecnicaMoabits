package com.example.pruebaTecnica.controller;


import com.example.pruebaTecnica.entity.Usuario;
import com.example.pruebaTecnica.repository.IUsuarioRepository;
import com.example.pruebaTecnica.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;
    private final Logger LOG = Logger.getLogger(""+ UsuarioController.class);

    @GetMapping("usuarios/list")
    public String getListUsuarios(Model model){
        LOG.log(Level.INFO,"getListUsuarios");
        List<Usuario> usuarios =usuarioService.findAll();
        model.addAttribute("usuarios",usuarios);
        for(Usuario user:usuarios){
            System.out.println(user.toString());
        }

        return "usuarios/list";
    }

    @GetMapping("usuarios/crear")
    public  String crearUsuario(Model model){
        LOG.log(Level.INFO,"crearUsuario");
        Usuario usuario = new Usuario();
        model.addAttribute("usuario",usuario);
        return "/usuarios/modificar";
    }

    @PostMapping("/guardar")
    public String guardarUsuario(@Valid Usuario usuario, BindingResult errores,Model model){
        LOG.log(Level.INFO,"guardarUsuario");


        if(errores.hasErrors()){
            var mensaje ="Valide todos los campos";
            model.addAttribute("msj",mensaje);
            return "/usuarios/modificar";
        }
        else {
            System.out.println(usuario.toString());
            usuario = usuarioService.createUsario(usuario);
            return "redirect:/usuarios/list";
        }
    }

    @RequestMapping(value = "/editar/{id}",method = RequestMethod.GET)
    public String editarUsuario(@PathVariable("id")int id, Model model){
        LOG.log(Level.INFO,"editarUsuario");
        System.out.println(id);
        Usuario usuario =usuarioService.findById(id);
        model.addAttribute("usuario",usuario);
        return "/usuarios/modificar";

    }

    @RequestMapping(value="/eliminar/{id}",method = RequestMethod.GET)
    public String deleteUsuario(@PathVariable("id")int id, Model model){
        LOG.log(Level.INFO,"deleteUsuario");
        usuarioService.deleteUsuario(id);
        return "redirect:/usuarios/list";
    }


}
