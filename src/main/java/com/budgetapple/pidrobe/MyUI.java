package com.budgetapple.pidrobe;

import javax.servlet.annotation.WebServlet;

import com.budgetapple.pidrobe.webapp.DefaultScreenDesign;
import com.budgetapple.pidrobe.webapp.DefaultScreenView;
import com.budgetapple.pidrobe.webapp.FrontPageCityView;
import com.budgetapple.pidrobe.webapp.FrontPageView;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    Navigator navigator;

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        getPage().setTitle("PiDrobe");

        // Create a navigator to control the views
        navigator = new Navigator(this, this);

        // Create and register the views
        navigator.addView(FrontPageView.NAME, FrontPageView.class);
        navigator.addView(FrontPageCityView.NAME,FrontPageCityView.class);
        navigator.addView(DefaultScreenView.NAME,DefaultScreenView.class);

        navigator.navigateTo(FrontPageView.NAME);

    }
}
