package co.com.falabella.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ResultadosPage {
    public static final Target DIV_LISTA_RESULTADO_BUSQUEDA = Target
            .the("Div que contiene listado de celulares disponibles")
            .locatedBy("//div[@id='testId-searchResults-products']");
    public static final Target DIV_CARD_RESULTADO = Target.the("Opción del acordión de la marca")
            .locatedBy("//div[@pod-layout='LIST']");
    public static final Target DIV_CARD_RESULTADO_BARRA = Target.the("Opción del acordión de la marca")
            .locatedBy("//div[@pod-layout='4_GRID']");
    public static final Target ACC_MARCA = Target.the("Opción del acordión de la marca")
            .locatedBy("//button[@id='testId-Accordion-Marca']");
    public static final Target IN_MARCA = Target.the("Barra de búsqueda en marca")
            .locatedBy("//input[@id='testId-Multiselect-Marca']");
    public static final Target CHK_NIKE = Target.the("Lista de checkbox de la marca")
            .locatedBy("//input[starts-with(@id,'NIKE')]");
    public static final Target CARD_PRIMER_RESULTADO_TABLET = Target
            .the("Tarjeta primer resultado búsqueda de tablet Apple")
            .locatedBy("//img[@id='testId-pod-image-19574589']/..");
    public static final Target BTN_PRIMER_RESULTADO_ZAPATOS = Target
            .the("Tarjeta primer resultado búsqueda de zapatos")
            .locatedBy("//button[@id='testId-Pod-action-10843740']");
    public static final Target BTN_TALLA = Target
            .the("Tarjeta primer resultado búsqueda de zapatos")
            .locatedBy("//button[@id='testId-sizeButton-10 US']");
    public static final Target BTN_AGREGAR_A_LA_BOLSA = Target
            .the("Tarjeta primer resultado búsqueda de zapatos")
            .locatedBy("//button[@id='add-to-cart']");
    public static final Target CARD_PRIMER_RESULTADO_ZAPATOS = Target
            .the("Tarjeta primer resultado búsqueda de zapatos")
            .locatedBy("//div[@id='testId-pod-10843751']");
    public static final Target CARD_TECNOLOGIA = Target.the("Id tarjeta de la opción Tecnología")
            .located(By.id("testId-pod-10843751"));

}
