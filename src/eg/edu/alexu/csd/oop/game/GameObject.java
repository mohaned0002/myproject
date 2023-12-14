/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


/**
 *
 * @author moham
 */

package eg.edu.alexu.csd.oop.game;
public interface GameObject {
/* setter/getter for X position*/ int getX();
void setX(int x);
/* setter/getter for Y position*/ int getY ();
void setY (int y) ;
/** Creturn object width */ int getWidth();
/** Creturn object height */ int getHeight ();
/** Creturn object visible or not */ boolean isVisible();
/** Preturn object movement frames */ java.awt.image.BufferedImage[] getSpriteImages() ;
}