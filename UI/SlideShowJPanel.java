/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.UI;

import com.Sell.Helper.ImageHelper;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author NguyenTruongChinh
 */
public class SlideShowJPanel extends javax.swing.JPanel {

    private String[] imageList = {
        "slide0.jpg",
        "slide1.jpg",
        "slide2.jpg",
        "slide3.jpg",
        "slide4.jpg",
        "slide5.jpg",
        "slide6.jpg"
    };
    
    private int indexSlide = 0;
    
    /**
     * Creates new form SlideShowJPanel
     */
    public SlideShowJPanel() {
        initComponents();
        init();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSlide = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        lblSlide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lblSlide, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblSlide;
    // End of variables declaration//GEN-END:variables

    private void init() {
        lblSlide.setSize(this.getSize());
        
        setBackGround(imageList[0]);
        indexSlide++;
        startSlideShow();
        lblSlide.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                setBackGround(imageList[indexSlide]);
            }
        });
    }

    private void setBackGround(String fileName) {
        lblSlide.setIcon(ImageHelper.readAndNoResize(lblSlide, fileName));
    }
    
    private void startSlideShow() {
        new Timer(2000, (ActionEvent e) -> {
            setBackGround(imageList[indexSlide]);
            indexSlide++;
            if (indexSlide == imageList.length) {
                indexSlide = 0;
            }
        }).start();
    }
}
