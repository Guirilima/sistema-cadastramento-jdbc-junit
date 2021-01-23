package service;

import model.UsuarioEntity;
import repository.UsuarioRepository;

import static java.util.Objects.nonNull;

public class UsuarioService {

    public boolean loginComprimento(String login) {
        return login.length() <= 20;
    }

    private UsuarioRepository rep = new UsuarioRepository();

    public void incluir(UsuarioEntity usuarioEntity) {
        //Validação usando o JUnit.
        //Acompanhar depois a lógica.

//        boolean comprimentoValido = TextoUtils.validaComprimento(usuarioEntity.getLogin(),20);
//        if (!comprimentoValido) {
//            throw new IllegalAccessException();
//        }

        usuarioEntity = rep.buscar(usuarioEntity.getLogin());

        if ( nonNull(usuarioEntity) ){
            throw new IllegalStateException("Já existe um usuario com o login " + usuarioEntity.getLogin());
        }

        rep.incluir(usuarioEntity);

        System.out.println("FIM");

    }
}
