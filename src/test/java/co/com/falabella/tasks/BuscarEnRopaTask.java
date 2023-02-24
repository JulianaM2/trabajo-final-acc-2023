package co.com.falabella.tasks;

import org.openqa.selenium.Keys;

import co.com.falabella.pages.BusquedaPrincipalPage;
import co.com.falabella.pages.ResultadosPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hover;
import net.serenitybdd.screenplay.actions.HoverOverElement;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;

public class BuscarEnRopaTask {
    public static Performable camisetaMujer(String terminoBusqueda, String marca) {
        return Task.where("{0} buscar por '" + terminoBusqueda + "'",
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
        return Task.where("{0} busca por zapatos",
                Open.url("https://www.falabella.com.co/falabella-co/"),
                Enter.theValue(terminoBusqueda)
                        .into(BusquedaPrincipalPage.IN_BARRA_BUSQUEDA)
                        .thenHit(Keys.ENTER),
                Click.on(ResultadosPage.DIV_CARD_RESULTADO_BARRA ),
                Scroll.to(ResultadosPage.BTN_PRIMER_RESULTADO_ZAPATOS),
                Hover.over(ResultadosPage.CARD_PRIMER_RESULTADO_ZAPATOS),
                Click.on(ResultadosPage.BTN_PRIMER_RESULTADO_ZAPATOS));
    }

    public static Performable zapatosOpciones() {
        return Task.where("{0} seslecciona la talla de los zapatos",
                Click.on(ResultadosPage.BTN_TALLA ));
    }
}
