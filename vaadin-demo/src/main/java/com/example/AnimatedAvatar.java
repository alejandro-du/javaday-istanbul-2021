package com.example;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

@JsModule("./animated-avatar.js")
@Tag("animated-avatar")
public class AnimatedAvatar extends Component {

  public AnimatedAvatar(String title, String image) {
    getElement().setAttribute("title", title);
    getElement().setAttribute("image", image);
  }
  
  

}
