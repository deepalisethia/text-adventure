package main.com.adventure.world.objects;
import main.com.adventure.world.objects.keys.HoleContent;
import main.com.adventure.world.objects.keys.Key;


public class Hole {
    HoleContent newHole;
    /**
     * Creates a hole with the given content.
     * @param content - the item that is covered by the hole.
     */
    public Hole(Key content) {
        newHole = new HoleContent(content);

    }

    public boolean isCovered() {
        //TODO This value should come from HoleContent

        return newHole.isCovered();
    }

    /**
     * Uncovers the hole. If applicable, the contents are now revealed.
     */
    public void dig() {
        //TODO this function should update HoleContent's isCovered property.
        newHole.setIsCovered(!newHole.isCovered());
    }

    /**
     * If the HoleContent is uncovered, return the key. Otherwise, return null.
     * @return the key if the hold is uncovered.
     */
    private Key getKeyIfPossible() {
        //TODO Get the HoleContent's content only if the hole is uncovered.
        if (!newHole.isCovered()) {
            return newHole.getKey();
        }

        return null;
    }

    /**
     * If the HoleContent is uncovered, return the content. Otherwise, return null.
     * @return - the content if the hole is uncovered.
     */
    public Tangible getContent() {
        return getKeyIfPossible();
    }
}
