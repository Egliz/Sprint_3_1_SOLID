import java.util.List;

public class Main {
    static void main(String[] args) {

        PlayInstrument guitar = new Guitar();
        PlayInstrument drums = new Drums();
        PlayInstrument piano = new Piano();

        guitar.Play();
        drums.Play();
        piano.Play();
    }
}
