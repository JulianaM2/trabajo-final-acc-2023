package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;

public class VisualizarPage {
    public static final Target BTN_COLOR = Target.the("Botón para seleccionar color")
            .locatedBy("//button[@id='testId-pod-colorSwatch-prod11990009']");
    public static final Target SPAN_COLOR = Target.the("Span para mostrar el color")
            .locatedBy("//span[@class='copy3 primary  jsx-2889528833 normal       notranslate']");
    public static final Target TITULO_ESPECIFICACIONES = Target.the("Título de las especificaciones")
            .locatedBy("//div[@class='jsx-3572506311 specifications-title']");
            
}
