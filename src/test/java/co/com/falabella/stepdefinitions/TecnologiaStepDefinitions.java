package co.com.falabella.stepdefinitions;

import co.com.falabella.pages.ResultadosPage;
import co.com.falabella.pages.VisualizarPage;
import co.com.falabella.tasks.BuscarEnBarraTask;
import co.com.falabella.tasks.BuscarEnTecnologiaTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class TecnologiaStepDefinitions {
    @Cuando("{actor} busca en la categoria tecnologia por un smartphone")
    public void busca_en_la_categoria_tecnologia_por_un_smartphone(Actor actor) {
        actor.attemptsTo(BuscarEnTecnologiaTask.smartphone());
    }

    @Entonces("{actor} debe encontrar al menos una opcion disponible")
    public void debe_encontrar_al_menos_una_opcion_disponible(Actor actor) {
        actor.attemptsTo(
                Ensure.that(ResultadosPage.DIV_LISTA_RESULTADO_BUSQUEDA)
                        .containsElements(ResultadosPage.DIV_CARD_RESULTADO.getCssOrXPathSelector()));
    }

    @Cuando("{actor} selecciona una tablet de la marca {string}")
    public void selecciona_una_tablet_de_la_marca_apple(Actor actor, String marca) {
        actor.attemptsTo(BuscarEnBarraTask.tablet(marca));
    }

    @Entonces("{actor} debe visualizar la informacion de la tablet y seleccionar su color de preferencia")
    public void debe_visualizar_la_informacion_de_la_tablet_y_seleccionar_su_color_de_preferencia(Actor actor) {
        actor.attemptsTo(
                // Ensure.that(VisualizarPage.TITULO_ESPECIFICACIONES).textContent().isEqualTo("Características destacadas"),
                Ensure.that(VisualizarPage.SPAN_COLOR).text().isEqualTo("Rosado"));
    }
}
