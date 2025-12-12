public class Main {
    public static void main(String[] args) {
        RatingDAO dao = new RatingDAO();

        // Add some ratings
        dao.addRating(1, 101, 5);
        dao.addRating(1, 102, 4);
        dao.addRating(1, 103, 3);

        // Get average rating
        double avg = dao.getAverageRating(1);
        System.out.println("Average Rating: " + avg);
        System.out.println("Stars: " + dao.getStars(avg));
    }
}
