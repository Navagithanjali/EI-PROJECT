package WeatherMonitoringSystem;

class ForecastDisplay implements Observer {
    private float currentPressure = 29.92f;
    private float lastPressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Forecast: " + (currentPressure > lastPressure ? "Improving weather on the way!" : 
                                            (currentPressure == lastPressure ? "More of the same" : "Watch out for cooler, rainy weather")));
    }
}
