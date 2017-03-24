import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Toolkit;

public void takeScreenshot(String file) throws Exception {
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    Rectangle rect = new Rectangle(size);
    Robot robot = new Robot();
    BufferedImage image = robot.createScreenCapture(rect);
    ImageIO.write(image, "png", new File(fileName));
}
