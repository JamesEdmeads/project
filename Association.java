import java.util.*;

public class Association  {

  private ArrayList<String> songs = new ArrayList<String>();


  public void addSong(String s) {

    songs.add(s); //add check

  }

  public String[] getSongs()  {

    String[] temp = songs.toArray(new String[songs.size()]);

    return temp;

  }


  //way to iterate and get next


}
