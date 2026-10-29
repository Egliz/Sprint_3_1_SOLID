
import java.util.List;

public class Musician {

    public void play(PlayInstrument instrument){
        instrument.play();
    }

    public void playAll(List<PlayInstrument> instruments){
        for(PlayInstrument instrument : instruments){
            instrument.play();
        }
    }
    //TODO esta clase DEBE SER capaz de tocar cualquier instrumento
    //si quieisera crear otro instrumento, esta clse no se toca
    //A esta clase se le puede pasar una lista de intrumentos y tocarlos todos
    //Testear el concepto
    //LLamar a esto en el main
}
