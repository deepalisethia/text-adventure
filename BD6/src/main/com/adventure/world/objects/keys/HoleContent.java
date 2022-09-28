package main.com.adventure.world.objects.keys;

public class HoleContent {
    private Key content;
    private boolean isCovered = true;

    /**
     * constructor takes a new key.
     * @param key HoleContent constructor requires a key parameter
     */
    public HoleContent(Key key) {
        this.content = key;
    }

    /**
     *
     * @param isCovered - boolean parameter to check if the hole is covered.
     */
    public void setIsCovered(boolean isCovered) {
        this.isCovered = isCovered;
    }

    public boolean isCovered() {
        return this.isCovered;
    }

    public Key getKey() {
        return content;
    }
}
