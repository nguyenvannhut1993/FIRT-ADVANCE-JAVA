/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1.pkg31;

/**
 *
 * @author nguyen van nhut
 */
public class CreateFactoryStyle {

    public IFactory getStyleStylized(String type) {
        if (type == null) {
            return null;
        } else if (type.equalsIgnoreCase("Style")) {
            return new StylizedAoDai();
        }
        return null;
    }
}
