package pl.edu.pjwstk.zad1.pattern;

import pl.edu.pjwstk.zad1.panel.CelsiusPanel;
import pl.edu.pjwstk.zad1.panel.FahrenheitPanel;

public class Mediator {
    private CelsiusPanel celsiusPanel;
    private FahrenheitPanel fahrenheitPanel;

    public void register(CelsiusPanel celsiusPanel){
        this.celsiusPanel = celsiusPanel;
    }

    public void register(FahrenheitPanel fahrenheitPanel){
        this.fahrenheitPanel = fahrenheitPanel;
    }


}
