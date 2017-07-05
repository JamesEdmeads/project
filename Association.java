import java.util.*;

public class Association  {

  private String name;
  private ArrayList<MediaType> songs = new ArrayList<MediaType>();

  Association(String name)  {

    this.name = name;

  }

  public String getName()  {

    String s = name;
    return s;

  }

  public void addSong(String s) {

    MediaType m = new MediaType(s);
    songs.add(m); //add check

  }

  public ArrayList<MediaType> getSongs()  {

    ArrayList<MediaType> temp = new ArrayList<MediaType>(songs);

    return temp;

  }


  //way to iterate and get next


}
