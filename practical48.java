import java.util.*;
class Main{
public static void main(String[] args){
System.out.println("Name - Dhruv Barot");
System.out.println("Enrollment No - 250393107002");
LinkedList<String> playlist=new LinkedList<String>();
playlist.add("Song1");
playlist.add("Song2");
playlist.add("Song3");
playlist.add("Song4");
playlist.add("Song5");
System.out.println("\nFull Playlist:");
for(String s:playlist)System.out.println(s);
System.out.println("\nPlaying First Song: "+playlist.removeFirst());
System.out.println("\nPlaylist After Playing First Song:");
for(String s:playlist)System.out.println(s);
System.out.println("\nSkipping Last Song: "+playlist.removeLast());
System.out.println("\nPlaylist After Skipping Last Song:");
for(String s:playlist)System.out.println(s);
}
}

