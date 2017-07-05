import java.io.*;
import java.util.*;

class FileStore  {

  private ArrayList<String> s;

  public ArrayList readFile()  {
    s = new ArrayList<String>();
    
    try  {
      FileReader r = new FileReader("stored/media.txt");
      BufferedReader br = new BufferedReader(r);

      String result = "";
  
      while((result = br.readLine()) != null)  {
        processResult(result);
      }
      br.close();
      r.close();
    } catch (IOException e)  {
      return s;
    }
    return s;

  }

  private void processResult(String result)  {

    s = new ArrayList<String>(Arrays.asList(result.split("¬")));
    //need assocations

  }


}
