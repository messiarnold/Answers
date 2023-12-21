public class Airport 
{
  Flight aray[];
  public boolean isFly()
  {
    for(int i = 0; i<this.aray.length;i++)
    {
      if(this.aray[i].getName().equals("Sky"))
      {
        return true;
      }
    }
    return false; //the error was that you need the return outside of the loop.
  }
}
