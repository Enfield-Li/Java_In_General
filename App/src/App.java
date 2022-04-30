import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class App {

  public static void main(String[] args)
    throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    File file = new File("src\\sound.wav");

    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

    Clip clip = AudioSystem.getClip();

    clip.open(audioStream);

    clip.start();

    Scanner scanner = new Scanner(System.in);

    String res = scanner.next();
  }
}
