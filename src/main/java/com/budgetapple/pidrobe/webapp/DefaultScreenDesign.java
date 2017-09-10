package com.budgetapple.pidrobe.webapp;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.declarative.Design;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.ComboBox;

/**
 * !! DO NOT EDIT THIS FILE !!
 * <p>
 * This class is generated by Vaadin Designer and will be overwritten.
 * <p>
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class DefaultScreenDesign extends VerticalLayout {
    protected Label dateLabel;
    protected Label currentTempLabel;
    protected Label maxTempLabel;
    protected Label minTempLabel;
    protected Label precipLabel;
    protected CssLayout weatherImageLayout;
    protected Image weatherImage;
    protected HorizontalLayout newsLayout;
    protected VerticalLayout news1VLayout;
    protected Image news1Image;
    protected Label news1Title;
    protected VerticalLayout news2VLayout;
    protected Image news2Image;
    protected Label news2Title;
    protected VerticalLayout news3VLayout;
    protected Image news3Image;
    protected Label news3Title;
    protected Button myClosetButton;
    protected ComboBox<String> genderComboBox;

    public DefaultScreenDesign() {
        Design.read(this);
    }
}
