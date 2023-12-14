/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


/**
 *
 * @author moham
 */
package eg.edu.alexu.csd.oop.game;
public interface World {
    java.util.List<GameObject> getConstantObjects () ;
    java.util.List<GameObject> getMovableObjects() ;
/** Creturn list of user controlled object
*/
java.util.List<GameObject> getControlableObjects() ;
/** Creturn screen width */ int getWidth ();
/** Creturn screen height */ int getHeight () ;
/**
* refresh the world state and update locations
* Creturn
false means game over
*/
boolean refresh ();
/**
* status bar content
* Greturn string to be shown at status bar
*/
String getStatus () ;
/** @return */int getSpeed();/*
frequency of calling refresh */
/** Creturn */
int getControlSpeed () ;/*
frequency of receiving user input */
}