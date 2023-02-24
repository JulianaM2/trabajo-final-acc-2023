package co.com.falabella.tasks;

import org.openqa.selenium.Keys;

import co.com.falabella.pages.BusquedaPrincipalPage;
import co.com.falabella.pages.BusquedaTecnologiaPage;
import co.com.falabella.pages.ResultadosPage;
import co.com.falabella.pages.VisualizarPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
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

    public static Performable tablet(String marca) {
        return Task.where("{0} busca en tecnologia una tablet",
                Open.url("https://www.falabella.com.co/falabella-co/"),
                Enter.theValue("Tablet " + marca)
                        .into(BusquedaPrincipalPage.IN_BARRA_BUSQUEDA)
                        .thenHit(Keys.ENTER),
                // Click.on(ResultadosPage.DIV_CARD_RESULTADO_BARRA + "[1]/div/a"));
                Click.on(ResultadosPage.CARD_PRIMER_RESULTADO_TABLET),
                Click.on(VisualizarPage.BTN_COLOR));
    }
}
