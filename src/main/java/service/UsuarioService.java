package service;

public class UsuarioService {

    public boolean loginComprimento(String login) {
        return login.length() <= 20;
    }
}
