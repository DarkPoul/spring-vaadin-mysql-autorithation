package com.dekanat.ntu.dekanatupdate.pages;

import com.dekanat.ntu.dekanatupdate.service.SecurityService;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class MainLayout extends AppLayout {

    public MainLayout(@Autowired SecurityService securityService) {

        H1 logo = new H1("Vaadin CRM");
        logo.addClassName("logo");
        HorizontalLayout header;
        UserDetails authenticatedUser = securityService.getAuthenticatedUser();
        if (authenticatedUser != null) {
            Button logout = new Button("Logout", click -> securityService.logout());
            header = new HorizontalLayout(logo, logout);
        } else {
            header = new HorizontalLayout(logo);
        }

        // Other page components omitted.

        addToNavbar(header);
    }
}
