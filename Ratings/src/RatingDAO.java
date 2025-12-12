import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RatingDAO {
    private Connection conn;

    public RatingDAO() {
        conn = DBConnect.getConnection();
    }

    // Add rating
    public void addRating(int itemId, int userId, int rating) {
        try {
            String sql = "INSERT INTO ratings(item_id, user_id, rating) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, itemId);
            ps.setInt(2, userId);
            ps.setInt(3, rating);
            ps.executeUpdate();
            System.out.println("Rating added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Get average rating for an item
    public double getAverageRating(int itemId) {
        double avg = 0;
        try {
            String sql = "SELECT AVG(rating) AS avg_rating FROM ratings WHERE item_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, itemId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                avg = rs.getDouble("avg_rating");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return avg;
    }

    // Convert numeric rating to stars
    public String getStars(double rating) {
        int fullStars = (int) Math.round(rating);
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < fullStars; i++) stars.append("★");
        for (int i = fullStars; i < 5; i++) stars.append("☆");
        return stars.toString();
    }
}
