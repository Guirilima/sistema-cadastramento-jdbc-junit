package service;

import model.UsuarioEntity;

public class UsuarioService {

    public boolean loginComprimento(String login) {
        return login.length() <= 20;
    }


    public void cadastrar(UsuarioEntity usuarioEntity) {

    }
}
