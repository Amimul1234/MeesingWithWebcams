import com.github.sarxos.webcam.Webcam;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class GetImageFromWebCam {
    public static void main( String[] args ) throws IOException {
        Webcam webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension(640, 480));
        webcam.open();

        BufferedImage bufferedImage = webcam.getImage();
        ImageIO.write(bufferedImage, "PNG", new File("image/" + UUID.randomUUID() + ".png"));
    }
}
