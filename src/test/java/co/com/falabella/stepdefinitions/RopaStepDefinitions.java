package co.com.falabella.stepdefinitions;

import co.com.falabella.pages.ResultadosPage;
import co.com.falabella.tasks.BuscarEnBarraTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class RopaStepDefinitions {
    @Cuando("{actor} busca por {string} en la barra de busqueda y filtra por marca {string}")
    public void busca_por_en_la_barra_de_busqueda_y_filtra_por_marca_adidas(Actor actor, String terminoBusqueda,
            String marca) {
        actor.attemptsTo(BuscarEnBarraTask.camisetaMujer(terminoBusqueda, marca));
    }

    @Entonces("{actor} debe encontrar al menos una opcion")
    public void debe_encontrar_al_menos_una_opcion_con(Actor actor) {
        actor.attemptsTo(
                Ensure.that(ResultadosPage.DIV_LISTA_RESULTADO_BUSQUEDA)
                        .containsElements(ResultadosPage.DIV_CARD_RESULTADO_BARRA.getCssOrXPathSelector()));
    }

    @Dado("que {actor} busca por {string} en la barra de busqueda")
    public void que_busca_por_en_la_barra_de_busqueda(Actor actor, String terminoBusqueda) {
        actor.attemptsTo(BuscarEnBarraTask.zapatos(terminoBusqueda));
    }

    @Cuando("{actor} elige su opcion de talla")
    public void elige_su_opcion_de_talla(Actor actor) {
        actor.attemptsTo(BuscarEnBarraTask.zapatosOpciones());
    }

    @Entonces("{actor} debe ver activo el boton de {string}")
    public void debe_ver_activo_el_boton_de(Actor actor, String textoBoton) {
        actor.attemptsTo(
                Ensure.that(ResultadosPage.BTN_AGREGAR_A_LA_BOLSA).text().isEqualToIgnoringCase(textoBoton));
    }
}
