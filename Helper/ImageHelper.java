package com.Sell.Helper;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dev-StOrM
 */
public class ImageHelper {

    static public ImageIcon resize(JComponent container, String path) throws IOException {
        BufferedImage image = ImageIO.read(new File(path));
        return new ImageIcon(image.getScaledInstance(container.getWidth(),
                container.getHeight(), BufferedImage.SCALE_SMOOTH));
    }

    static public byte[] convertToByteArray(String path) throws IOException {
        BufferedImage bImage = ImageIO.read(new File(path));
        String formatName = path.substring(path.lastIndexOf('.') + 1);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write(bImage, formatName, bos);

        return bos.toByteArray();
    }

    static public byte[] convertToByteArray(Icon icon) throws IOException {
        BufferedImage bImage = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(),
                BufferedImage.SCALE_SMOOTH);
        Graphics2D g = bImage.createGraphics();
        g.drawImage(bImage, null, null);
        icon.paintIcon(null, g, 0, 0);
        g.dispose();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bImage, "jpg", baos);

        return baos.toByteArray();
    }

    static public ImageIcon revertFromArrayByte(byte[] imageByte) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(imageByte);
        BufferedImage bImage = ImageIO.read(bais);

        return new ImageIcon(bImage.getScaledInstance(bImage.getWidth(),
                bImage.getHeight(), BufferedImage.SCALE_SMOOTH));
    }

    static public ImageIcon revertFromArrayByte(JComponent container, byte[] imageByte) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
        BufferedImage bImage = ImageIO.read(bis);

        return new ImageIcon(bImage.getScaledInstance(container.getWidth(),
                container.getHeight(), BufferedImage.SCALE_SMOOTH));
    }

    public static void setDefaultImage(JLabel container) throws IOException {
        BufferedImage image = ImageIO.read(new File("src\\com\\SELL\\Images", "default_image.png"));
        // https://stackoverflow.com/questions/9147977/getwidth-and-getheight-are-0-after-calling-setpreferredsize
        // phải setSize vì component trong panel khi chưa được gọi lên sẽ không có size
        container.setIcon(new ImageIcon(image.getScaledInstance(190, 240, BufferedImage.SCALE_SMOOTH)));
    }

}
