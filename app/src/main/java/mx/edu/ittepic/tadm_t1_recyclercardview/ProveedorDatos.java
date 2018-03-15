package mx.edu.ittepic.tadm_t1_recyclercardview;

/**
 * Created by adelina on 14/03/2018.
 */

public class ProveedorDatos {
    private String title;
    private String shortdesc;
    private double rating;
    private int image;

    public ProveedorDatos(String title, String shortdesc, double rating, int image) {
        this.title = title;
        this.shortdesc = shortdesc;
        this.rating = rating;
        this.image = image;
    }
    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public double getRating() {
        return rating;
    }

    public int getImage() {
        return image;
    }
}
