package com.epicodus.breakthecode.models;

import com.epicodus.breakthecode.R;

import java.util.ArrayList;

/**
 * Created by Guest on 10/20/15.
 */
public class PartnerLib {
    private ArrayList<Partner> mPartners;

    public PartnerLib() {
        setNonProfitPartners();
    }

    public ArrayList<Partner> getPartners() {
        return mPartners;
    }

    public void setNonProfitPartners() {
        mPartners = new ArrayList<>();

        final boolean add = mPartners.add(new Partner(
                "Add camp for Girls",
                "Add Camp for Girls is a place where girls can put their creative powers to work,designing  and building apps, while learning " +
                        "more about the business of software and being inspired by women mentors in the field",
                "http://appcamp$girls.com/",
                R.drawable.app_camp_for_girls


        ));

        mPartners.add(new Partner(
                "ChickTech",
                "ChickTech is dedicated to retaining women in the technology workforce and increasing the number of women and girls pursuing technology-based careers",
                "http://chicktech.org/",
                R.drawable.chicktech_logo_final_03
        ));

        mPartners.add(new Partner(
                "Girl Develop It",
                "Girl Develop It is a nonprofit organization that provides affordable programs for adult women interested in learning web and software development in a judgment-free environment.",
                "https://www.girldevelopit.com/",
                R.drawable.gdi_logo
        ));
    }
}
