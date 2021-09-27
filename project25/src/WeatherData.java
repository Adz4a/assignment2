import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private float temperature, humidity, pressure;


    @Override
    public void registerObserver(Observer newObserver) {
        this.observers.add(newObserver);
    }

    @Override
    public void unregisterObserver(Observer removeObserver) {
        this.observers.add(removeObserver);
        }



    @Override
    public void notifyObserver() {
        for (Observer weather : observers ) {
            weather.update(this.temperature, this.humidity, this.pressure);
        }
    }

    public void setMeasurement(float temperature, float humidity, float pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.notifyObserver();

    }



}