package co.com.falabella.tasks;

import org.openqa.selenium.Keys;

import co.com.falabella.pages.BusquedaPrincipalPage;
import co.com.falabella.pages.ResultadosPage;
import co.com.falabella.pages.VisualizarPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;

public class BuscarEnBarraTask {
    public static Performable camisetaMujer(String terminoBusqueda, String marca) {
        return Task.where("{0} buscar por '" + terminoBusqueda + "' y filtra",
                Open.url("https://www.falabella.com.co/falabella-co/"),
                Enter.theValue(terminoBusqueda)
                        .into(BusquedaPrincipalPage.IN_BARRA_BUSQUEDA)
                        .thenHit(Keys.ENTER),
                Click.on(ResultadosPage.ACC_MARCA),
                Enter.theValue(marca)
                        .into(ResultadosPage.IN_MARCA)
                        .thenHit(Keys.ENTER),
                Click.on(ResultadosPage.CHK_NIKE));
    }

    public static Performable zapatos(String terminoBusqueda) {
        return Task.where("{0} busca por '" + terminoBusqueda + "' y abre opciones",
                Open.url("https://www.falabella.com.co/falabella-co/"),
                Enter.theValue(terminoBusqueda)
                        .into(BusquedaPrincipalPage.IN_BARRA_BUSQUEDA)
                        .thenHit(Keys.ENTER),
                Scroll.to(ResultadosPage.CARD_PRIMER_RESULTADO_ZAPATOS),
                MoveMouse.to(ResultadosPage.CARD_PRIMER_RESULTADO_ZAPATOS),
                Click.on(ResultadosPage.BTN_PRIMER_RESULTADO_ZAPATOS));
    }

    public static Performable zapatosOpciones() {
        return Task.where("{0} seslecciona la talla de los zapatos",
                Click.on(ResultadosPage.BTN_TALLA ));
    }

    public static Performable tablet(String marca) {
        return Task.where("{0} busca en tecnologia una tablet y selecciona color",
                Open.url("https://www.falabella.com.co/falabella-co/"),
                Enter.theValue("Tablet " + marca)
                        .into(BusquedaPrincipalPage.IN_BARRA_BUSQUEDA)
                        .thenHit(Keys.ENTER),
                Click.on(ResultadosPage.CARD_PRIMER_RESULTADO_TABLET),
                Click.on(VisualizarPage.BTN_COLOR));
    }

    public static Performable gafasDeSol(String terminoBusqueda) {
        return Task.where("{0} busca por '" + terminoBusqueda + "' y agrega a la bolsa",
                Open.url("https://www.falabella.com.co/falabella-co/"),
                Enter.theValue(terminoBusqueda)
                        .into(BusquedaPrincipalPage.IN_BARRA_BUSQUEDA)
                        .thenHit(Keys.ENTER),
                Scroll.to(ResultadosPage.CARD_PRIMER_RESULTADO_GAFAS),
                MoveMouse.to(ResultadosPage.CARD_PRIMER_RESULTADO_GAFAS),
                Click.on(ResultadosPage.BTN_PRIMER_RESULTADO_GAFAS));
    }
}
