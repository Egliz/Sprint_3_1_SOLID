import java.util.List;

public class Main {
    static void main(String[] args) {

        PlayInstrument guitar = new Guitar();
        PlayInstrument drums = new Drums();
        PlayInstrument piano = new Piano();

        Musician musician = new Musician();

        musician.play(guitar);
        musician.playAll(List.of(drums, piano));

    }
}
