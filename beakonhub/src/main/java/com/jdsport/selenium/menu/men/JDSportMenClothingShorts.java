package com.jdsport.selenium.menu.men;

import com.jdsport.selenium.JDSportVerification;
import com.jdsport.selenium.productDetails.JDSportProductDetailsPage;

public class JDSportMenClothingShorts
{
    public boolean isAt(String title)
    {
        JDSportVerification.menShortCategory(title);

        return true;
    }

    public JDSportMenClothingShorts productListBanner()
    {
        return new JDSportMenClothingShorts();
    }

    public JDSportProductDetailsPage mainProductList()
    {
        return new JDSportProductDetailsPage();
    }
}
