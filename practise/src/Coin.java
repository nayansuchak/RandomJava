enum Face {
    HEAD("Head"),
    TAIL("Tail");
    public final String label;

    private Face(String label) {
        this.label = label;
    }

}

public class Coin {
    String owner;
    Face face;

    public Coin(String owner, Face face) {
        this.owner = owner;
        this.face = face;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "owner:'" + owner + '\'' +
                ", face=" + face +
                '}';
    }

    public void toggleFace() {
        if (face == Face.HEAD) {
            face = Face.TAIL;
        }
    }

    public void toggleFace(Face face) {
        this.face = face;
    }

    public static void main(String args[]) {
        Coin coin = new Coin("Owner", Face.TAIL);
        System.out.println("Owner is " + coin.owner + " and face value is : " + coin.face);
    }
}