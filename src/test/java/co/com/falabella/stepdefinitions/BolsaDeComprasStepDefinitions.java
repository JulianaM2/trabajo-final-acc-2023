package co.com.falabella.stepdefinitions;

import co.com.falabella.pages.ResultadosPage;
import co.com.falabella.tasks.BuscarEnBarraTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class BolsaDeComprasStepDefinitions {
    @Cuando("{actor} agrega unas {string} a la bolsa de compras")
    public void agrega_un_producto_a_la_bolsa_de_compras(Actor actor, String producto) {
        actor.attemptsTo(BuscarEnBarraTask.gafasDeSol(producto));
    }

    @Entonces("{actor} debe ver un mensaje confirmacion y debe poder seguir comprando")
    public void debe_ver_un_mensaje_confirmacion_y_debe_poder_seguir_comprando(Actor actor) {
        actor.attemptsTo(
                Ensure.that(ResultadosPage.SPAN_TITULO_MODAL_PRODUCTO_AGREGADO).text()
                        .isEqualToIgnoringCase("Producto(s) agregado(s) a la bolsa de compras"));
    }
}
