package example;

import my.WeatherInterfaceImpl;
import my.WeatherInterfaceImplService;


public class HelloWorldClient {
  public static void main(String[] argv) {
      my.WeatherInterfaceImplService service = new WeatherInterfaceImplService();
      //invoke business method
      WeatherInterfaceImpl weatherInterface = service.getPort(WeatherInterfaceImpl.class);
      String weather = weatherInterface.queryWeather("北京");
      System.out.println(weather);
  }
}
