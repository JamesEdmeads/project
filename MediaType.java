public class MediaType  {

  String name;
  Association a = new Association();

  MediaType(String name)  {

    this.name = name;

  }

  public String getName()  {

    String s = name;
    return s;    

  }

  public void addAssociation(String s)  {

    a.addSong(s);

  }

  public String[] getSongs()  {

    String[] temp = a.getSongs();

    return temp;

  }

}
