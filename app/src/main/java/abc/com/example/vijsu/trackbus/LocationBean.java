package abc.com.example.vijsu.trackbus;

/**
 * Created by vijsu on 14-04-2016.
 */
public class LocationBean {
    private double latitude;
    private double longitude;

    public LocationBean() {

    }

    public LocationBean(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
