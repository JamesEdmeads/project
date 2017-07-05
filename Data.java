import java.util.*;

public class Data  {

  ArrayList<MediaType> data = new ArrayList<MediaType>();

  Data() {
  
    loadFile();

  }

  private void loadFile()  {

    FileStore fs = new FileStore();

    ArrayList results = fs.readFile();  

    Iterator i = results.iterator();
    while(i.hasNext())  {
      MediaType m = new MediaType(i.next().toString());
      //need association stuff here
      data.add(m);
    }

  }


  public static void main(String[] args)  {

    Data d = new Data();

  }


  //need way to load from file on start
  //load both visual and audio

  //as things added -> update file so does not matter when close

  //need method to get next thing
  

  

}
