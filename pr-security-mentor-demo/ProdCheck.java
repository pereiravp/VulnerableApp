package demo;

public class ProdCheck {
    public String buildQuery(String userId) {
        String sql = "SELECT * FROM users WHERE id=" + userId;
        return sql;
    }
}
