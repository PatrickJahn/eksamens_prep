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
public class combinedCatDTO {
    
    List<categoryDTO> food;
    List<drinksCategoryDTO> drink;

    public combinedCatDTO(List<categoryDTO> food, List<drinksCategoryDTO> drink) {
        this.food = food;
        this.drink = drink;
    }

    public List<categoryDTO> getFood() {
        return food;
    }

    public List<drinksCategoryDTO> getDrink() {
        return drink;
    }
    
    

    public void setFood(List<categoryDTO> food) {
        this.food = food;
    }

    public void setDrink(List<drinksCategoryDTO> drink) {
        this.drink = drink;
    }
    
    
    
    
}
