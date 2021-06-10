# Taller03-SOLID
# 1) Principio SOLID violado OCP

Las clases de helado y pastel poseen código muy similares. Se crea la clase padre Postre, una clase óptima, en el cual las clase hijas helado y pastel heredan los métodos y atributos según los requerimientos necesarios. Con este diseño, el código queda abierto para extensión ya que habría muchas formas de agregar sin modificar el código existente.

![clase postre](https://user-images.githubusercontent.com/33164047/121559752-7e118e80-c9dc-11eb-9d7f-3b7e89f0276a.jpg)

# 2) Principio SOLID violado SRP

Los procesos de agregar o quitar un aderezo, perfectamente pueden estar incluidos en la clase padre Postre, la herencia en las clases helado y pastel podran modificarse según se requiera. Se mantiene la responsabilidad de maneja la información del postre y usa los métodos de las demás clases. 

![WhatsApp Image 2021-06-10 at 11 52 36](https://user-images.githubusercontent.com/33164047/121568325-35120800-c9e5-11eb-878d-0175be1f5837.jpeg)

# 3) Principio SOLID violado OCP

Se crea una nueva clase de ManejadordePrecio, para que las clases helado y pastel no convellen la responsabilidad y asi no violar el principio OCP, debido a que si se desea modificar el precio de los postres se tendría que abrir la clase postres para modificarla. 

![WhatsApp Image 2021-06-10 at 11 57 31](https://user-images.githubusercontent.com/33164047/121569292-40b1fe80-c9e6-11eb-956b-c350826837d3.jpeg)

# 4) Principio SOLID violado DIP

La clase aderezo esta muy desacoplada, si se desea bajar con cada tipo de aderezo que existe no se va a lograr. Por el cual se crean las subclases frutilla, crema y malvadiscos que extienden de aderezo para una mejor modificación y asi no violar el principio DIP.

![SOLID4 DIP ](https://user-images.githubusercontent.com/84789414/121574744-3430a480-c9ec-11eb-8a12-68ffc1c84c26.png)


# 5) Principio SOLID violado DIP

El manejador de leche daba un error de compatibilidad y accesibilidad con otras clases. Mientras que en la clase leche entera posee el método abstracto usar pastel, lo que hacia que la clase leche deslactosada lo implemente, sin embargo para los pasteles no se puede utilizar la leche deslactosada porque se dañaría la mezcla. Lo cual realizaba que implemente un método no deseado. Se quita el metodo asbtracto y se lo agrega postre mediante una validación para verificar si el postre es un helado o un pastel y asi no violar el DIP.

![WhatsApp Image 2021-06-10 at 13 00 11](https://user-images.githubusercontent.com/33164047/121574424-df8d2980-c9eb-11eb-9fd8-df6039099ec2.jpeg)

