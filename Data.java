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
      String s = i.next().toString();
      String[] end = s.split("\\.");
      if(end[1].equals("jpg"))  {
        MediaType m = new MediaType(s);
        System.out.println("first here "+s);
        data.add(m);
      }
      else {
        MediaType temp = data.get(data.size()-1);
        temp.addAssociation(s);
      }
    }

  }

  public ArrayList<MediaType> getData()  {

    ArrayList<MediaType> temp = new ArrayList<MediaType>(data);
  
    return temp;

  }


  public static void main(String[] args)  {

    Data d = new Data();

  }


  //need way to load from file on start
  //load both visual and audio

  //as things added -> update file so does not matter when close

  //need method to get next thing
  

  

}
