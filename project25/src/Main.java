
public class Main {

    public static void main(String[] args) {

        WeatherData WeatherData = new WeatherData();
        User user = new User("Adzha");

        WeatherData.registerObserver(user);

        CurrentConditionsDisplay data = new CurrentConditionsDisplay(WeatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(WeatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(WeatherData);


        WeatherData.setMeasurement(80, 100, 31f);


    }

}