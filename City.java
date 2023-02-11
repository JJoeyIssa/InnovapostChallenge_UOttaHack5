public class City {

    //get the position of the cities

    //get the distance between all the cities 
    // formula sqrt(x^2 + y^2)

    //rubric to be edited and customized
    private int x;
    private int y;

    public City() {
        this.x = (int) (Math.random() * 500);
        this.y = (int) (Math.random() * 500);
    }

    public double distanceToCity(City city) {
        int x = Math.abs(getX() - city.getX());
        int y = Math.abs(getY() - city.getY());
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}