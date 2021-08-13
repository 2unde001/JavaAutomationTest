package com.men.shortTest;

import com.jdsport.selenium.productListing.mensShorts.JDSportMenShortsListingPage;
import org.junit.Test;
import org.junit.runners.Parameterized;

public class JDSportMenShortsTest
{
    JDSportMenShortsListingPage menClothingShorts;

    @Test

    public void selectFirstShortFromTheList()
    {
        menClothingShorts = new JDSportMenShortsListingPage();
        menClothingShorts.mainProductList().firstItemOnTheList();

        //Assert.assertTrue("", menClothingShorts.mainProductList().firstItemOnTheList(), );


    }

}
