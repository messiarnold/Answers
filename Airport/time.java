public class time
{
  private int hour;
  private int minute;

  public void sethour(int hour)
  {
    this.hour = hour;
    if(hour > 24 || hour < 0)
    {
      this.hour = 0;
    }
  }

  public void setminute(int minute)
  {
    this.minute = minute;
    if(minute > 59 || minute < 0)
    {
      this.minute = 0;
    }
  }
  public int gethour()
  {
    return hour;
  }
  public int getminute()
  {
    return minute;
  }
  public time(int hour,int minute)
  {
    this.hour = hour;
    this.minute = minute;
    if(hour > 24 || hour < 0)
    {
      this.hour = 0;
    }
    if(minute > 59 || minute < 0)
    {
      this.minute = 0;
    }
  }
}