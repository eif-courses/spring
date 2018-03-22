package com.example;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Marius on 2/8/2017.
 */

@SpringUI
@Theme("valo")
public class VaadinUI extends UI {

    @Autowired
    private Service service;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        TextField t = new TextField("Iveskite varda:");
        TextField t2 = new TextField("IVeskite pavarde");
        Button b = new Button("Patvirtinti");
        VerticalLayout v = new VerticalLayout(t, t2, b);
        v.setMargin(true);
        v.setSpacing(true);
        setContent(v);
        b.addClickListener(e-> Notification.show(service.zinute(t.getValue())));
    }
}
