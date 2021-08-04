package com.men.shortTest;

import com.jdsport.selenium.menu.men.JDSportMenClothingShorts;
import org.junit.Test;

public class JDSportMenShortsTest
{
    JDSportMenClothingShorts menClothingShorts;

    @Test
    public void selectFirstShortFromTheList()
    {
        menClothingShorts = new JDSportMenClothingShorts();

        menClothingShorts.mainProductList().firstItemOnTheList();


    }

}
