package Trees;

public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isInRepeatingPlaylist() {
        Song slow = this;
        Song fast = this;

        while (fast != null && fast.nextSong != null) {
            slow = slow.nextSong; // Move slow pointer by one step
            fast = fast.nextSong.nextSong; // Move fast pointer by two steps

            // If slow and fast meet, a cycle is detected
            if (slow == fast) {
                return true;
            }
        }

        // If fast pointer reaches null, there is no cycle
        return false;
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isInRepeatingPlaylist()); // Should print "true"
    }
}