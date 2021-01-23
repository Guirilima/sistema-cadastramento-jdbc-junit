package service;

import Utils.TextoUtils;
import model.UsuarioEntity;
import repository.UsuarioRepository;

import static java.util.Objects.nonNull;

public class UsuarioService {

    public boolean loginComprimento(String login) {
        return login.length() <= 20;
    }

    private UsuarioRepository rep = new UsuarioRepository();

    public void incluir(UsuarioEntity usuarioEntity) throws IllegalAccessException {

        boolean comprimentoValido = TextoUtils.validaComprimento(usuarioEntity.getLogin(),20);
        if (!comprimentoValido) {
            throw new IllegalAccessException();
        }

        usuarioEntity = rep.buscarByLogin(usuarioEntity.getLogin());

        if ( rep.exists(usuarioEntity.getLogin() ))  //nonNull(usuarioEntity) ){
        {
            throw new IllegalStateException("Já existe um usuario com o login " + usuarioEntity.getLogin());
        }

        rep.incluir(usuarioEntity);

    }
}
