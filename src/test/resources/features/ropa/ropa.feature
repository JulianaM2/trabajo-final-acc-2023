# language: es
Característica: Buscar producto y filtrar

  Escenario: Buscar por una camiseta de mujer
    Cuando "Juliana" busca por "Camiseta de mujer" en la barra de busqueda y filtra por marca "Nike"
    Entonces "Juliana" debe encontrar al menos una opcion
