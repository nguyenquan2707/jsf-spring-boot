package nl.georg.jsfspringboot.view;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named("landingPageView")
@ViewScoped
public class LandingPageView {

    public String getMessage() {
        return "message";
    }
}
