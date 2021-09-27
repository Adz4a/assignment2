public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 30.0f;
    private float lastPressure;
    private Subject WeatherData;

    public ForecastDisplay(Subject WeatherData) {
        this.WeatherData = WeatherData;
        this.WeatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.lastPressure = this.currentPressure;
        this.currentPressure = pressure;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("Forecast: ");
        if (this.currentPressure > this.lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (this.currentPressure == this.lastPressure) {
            System.out.println("More of the same");
        } else if (this.currentPressure < this.lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

}
