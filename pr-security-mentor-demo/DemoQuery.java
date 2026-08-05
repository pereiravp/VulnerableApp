package demo;

/**
 * Ficheiro de demonstração isolado, criado só para testar a GitHub App
 * "PR Security Mentor" contra este repositório. Não faz parte da
 * aplicação real e não deve ser fundido/mantido.
 */
public class DemoQuery {

    public String buildQuery(String userId) {
        String sql = "SELECT * FROM users WHERE id=" + userId;
        return sql;
    }

    public void debugEval(String expr) {
        Object result = eval(expr);
    }

    private Object eval(String expr) {
        return null;
    }
}
