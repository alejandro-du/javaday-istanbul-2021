package com.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
public class VaadinView extends VerticalLayout {
  
  public VaadinView() {
    var textField = new TextField("Name");
    var comboBox = new ComboBox<String>("Feedback", "Good talk", "Boring talk");
    add(
        new H1("Hello!"),
        new Paragraph("This is a Web Component"),
        new AnimatedAvatar("Java Day Istanbul",
            "https://static.wixstatic.com/media/caeeb8_273cbe181f304dc5846b217719ddcfed~mv2.png/v1/crop/x_0,y_667,w_3508,h_1182/fill/w_928,h_312,al_c,q_85,usm_0.66_1.00_0.01/beyaz-01-01.webp"),
        textField,
        comboBox,
        new Button("Send", event -> {
          // service.sendFeedback(TextField.getValue
          Notification.show("Thank you, " + textField.getValue());
        })
        
        );
  }

}
