/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.List;

/**
 *
 * @author Patrick
 */
public class drinkInfoDTO {
    
    List<drinkInfoDTO> drinks;
    String strDrink;
    String strAlcoholic;
    String strGlass;
    String strInstructions;

    public List<drinkInfoDTO> getDrinks() {
        return drinks;
    }
    
    
    
}
