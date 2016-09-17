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
public class CreateFactoryChinese {

    public IFactory getStyleChinese(String type) {
        if (type == null) {
            return null;
        } else if (type.equalsIgnoreCase("chinese")) {
            return new chineseDressBack();
        }
        return null;
    }
}
