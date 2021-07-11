import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamMotionDetector;
import com.github.sarxos.webcam.WebcamMotionEvent;
import com.github.sarxos.webcam.WebcamMotionListener;

import java.io.IOException;

public class MotionDetectionUsingWebCam implements WebcamMotionListener {

    public MotionDetectionUsingWebCam() {
        WebcamMotionDetector detector = new WebcamMotionDetector(Webcam.getDefault());
        detector.setInterval(500);
        detector.addMotionListener(this);
        detector.start();
    }

    @Override
    public void motionDetected( WebcamMotionEvent wme ) {
        System.out.println("Motion detected");
    }

    public static void main( String[] args ) throws IOException {
        new MotionDetectionUsingWebCam();
        System.in.read();
    }
}
