# language: es
Característica: Seleccionar talla

  Escenario: Buscar por unos zapatos y elegir opciones
    Dado que "Juliana" busca por "Zapatos adidas" en la barra de busqueda
    Cuando "Juliana" elige su opcion de talla
    Entonces "Juliana" debe ver activo el boton de "Agregar a la bolsa"
