package co.com.falabella.tasks;

import co.com.falabella.pages.BusquedaPrincipalPage;
import co.com.falabella.pages.BusquedaTecnologiaPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;

public class BuscarEnTecnologiaTask {
    public static Performable smartphone() {
        return Task.where("{0} busca en tecnologia un smartphone",
                Open.url("https://www.falabella.com.co/falabella-co/"),
                Scroll.to(BusquedaPrincipalPage.CARD_TECNOLOGIA),
                Click.on(BusquedaPrincipalPage.OPC_TECNOLOGIA),
                Click.on(BusquedaTecnologiaPage.OPC_SMARTPHONES));
    }
}
