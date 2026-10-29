public class Main {
    static void main(String[] args) {

        PlayInstrument guitar = new Guitar();
        PlayInstrument drums = new Drums();
        PlayInstrument piano = new Piano();

        guitar.play();
        drums.play();
        piano.play();
    }
}
