import com.github.sarxos.webcam.Webcam;

import java.util.List;

public class DetectWebCam {
    public static void main( String[] args ) {

        List<Webcam> webcam = Webcam.getWebcams();

        webcam.forEach(webcam1 ->
                System.out.println("Webcam: " + webcam1.getName()));
    }
}
