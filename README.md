<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width="50" height="50" />
<br>

# Ejemplo de factura con inyección de dependencia en Spring
Este es un ejemplo de una aplicación que muestra una factura con inyección de dependencia en Spring. ¡Echa un vistazo a los detalles!

<br>

## Instalación y uso
1. 📥 Clona este repositorio 
2. 🚀 Ejecuta `mvn spring-boot:run` para iniciar la aplicación 
3. 💻 Abre `http://localhost:8080/invoice/detail` en tu navegador para ver los detalles de la factura

## Más información
Este proyecto incluye los siguientes elementos:

* Un controlador que maneja la ruta para ver los detalles de la factura 
* Una clase `Customer` que representa al cliente de la factura
* Una clase `Invoice` que representa la factura
* Una clase `ItemInvoice` que representa un item de la factura. Contiene un objeto `Product` y una cantidad. Proporciona un método `calculateAmount()` para calcular el monto total de este item. 
* Una clase `Product` que representa un producto. Contiene un nombre y un precio.
* Una clase de configuración de Spring llamada `AppConfig` que proporciona dos métodos que registran listas de items de factura como beans de Spring. Uno de ellos se marca como el bean principal para este tipo de objeto.


La vista `invoice/detail` muestra los detalles de la factura, incluyendo el nombre del cliente, la descripción de la factura y una tabla con los items de la factura.

## Contribuciones
Este es un ejemplo de práctica. Pero si quieres mejorarlo ¡adelante! 😊


<br/>
<br/>
<br/>

---
Con ❤️ por [Yazmin-Erazo](https://github.com/yazmin-erazo)

<br/>
<a href="https://www.linkedin.com/in/yazmin-erazo/" rel="nofollow">
    <img src="https://camo.githubusercontent.com/a493f6833f99fb3c85788d6d9305e6b7a42b838e5ee5d138fd9a8214a7e77472/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f6c696e6b6564696e2d2532333030373742352e7376673f267374796c653d666f722d7468652d6261646765266c6f676f3d6c696e6b6564696e266c6f676f436f6c6f723d7768697465" data-canonical-src="https://img.shields.io/badge/linkedin-%230077B5.svg?&amp;style=for-the-badge&amp;logo=linkedin&amp;logoColor=white" style="max-width: 100%;">
 </a>
