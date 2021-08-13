package com.jdsport.selenium.productListing.mensShorts;
import com.jdsport.selenium.JDSportVerification;
import com.jdsport.selenium.productListing.JDSportProductLists;

public class JDSportMenShortsListingPage
{
    public boolean isAt(String title)
    {
        JDSportVerification.menShortCategory(title);

        return true;
    }

    public JDSportMenShortsListingPage productListBanner()
    {

        return new JDSportMenShortsListingPage();
    }


    public JDSportMenShortsListingPage mainProductList()
    {
        return new JDSportMenShortsListingPage();
    }

    public void firstItemOnTheList()
    {
       JDSportProductLists.selectItem();
    }
}
