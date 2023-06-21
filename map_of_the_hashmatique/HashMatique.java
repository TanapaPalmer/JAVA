import java.util.HashMap;

public class HashMatique {
    public static void main(String[] args){
        HashMap<String, String> songs = new HashMap<String, String>();
        songs.put("Uprising", "Paranoia is in bloom.....");
        songs.put("Feeling Good", "Birds flying high, you know how I feel.....");
        songs.put("Starlight", "Far away. This ship is taking me far away.....");
        songs.put("New Born", "Link it to the world. Link it to yourself.....");


        for(String key : songs.keySet()){
            System.out.println(String.format("Track: %s - Lyrics: %s", key, songs.get(key)));
        }
    }
}