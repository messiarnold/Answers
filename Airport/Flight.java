import java.util.Scanner;
public class Flight 
{
  private String destination;
  private String name;
  private String FlightCode;
  private time flighttime;

  public void setdestination(String detsination)
  {
    this.destination = detsination;
  }
  public void setname(String name)
  {
    this.name = name;
  }
  public void setFlightCode(String FlightCode)
  {
    this.FlightCode = FlightCode;
  }
  public void setflighttime(time flighttime)
  {
    this.flighttime = flighttime;
  }
  public String getDestination() 
  {
    return destination;
  }
  public String getName() 
  {
    return name;
  }
  public String getFlightCode() 
  {
    return FlightCode;
  }
  public time getFlighttime() 
  {
    return flighttime;
  }
  public Flight(String destination, String name, String flightCode, time flighttime) 
  {
    this.destination = destination;
    this.name = name;
    this.FlightCode = flightCode;
    this.flighttime = flighttime;
  }
  
}
