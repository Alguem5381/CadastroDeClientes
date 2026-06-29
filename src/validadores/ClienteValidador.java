package validadores;

import java.util.regex.Pattern;

import model.Cliente;

public class ClienteValidador {
    static Pattern nomePattern = Pattern.compile("^[A-Za-zÀ-ÿ]+$");
    static Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    static Pattern telefonePattern = Pattern.compile("^\\(\\d{2}\\)\\s?\\d{4,5}-\\d{4}$");

    public static Cliente match(String nome, String telefone, String email, String sexo, String data) {
        nome = match(nome, nomePattern, "O nome não é valido! Evite caracteres estranhos ou números");
        telefone = match(telefone, telefonePattern, "O telefone não é valido! Use o formato: (69) 99999-9999");
        email = match(email, emailPattern, "O email não é valido!");

        return new Cliente(nome, telefone, email, sexo, data);
    }

    public static Cliente match(int id, String nome, String telefone, String email, String sexo, String data) {
        nome = match(nome, nomePattern, "O nome não é valido! Evite caracteres estranhos ou números");
        telefone = match(telefone, telefonePattern, "O telefone não é valido! Use o formato: (69) 99999-9999");
        email = match(email, emailPattern, "O email não é valido!");

        return new Cliente(id, nome, telefone, email, sexo, data);
    }

    private static String match(String match, Pattern matchPattern, String message) {
        if (match == null)
            throw new IllegalArgumentException(message);

        var matchMatcher = matchPattern.matcher(match);

        if (!matchMatcher.matches())
            throw new IllegalArgumentException(message);

        return matchMatcher.group(0);
    }
}