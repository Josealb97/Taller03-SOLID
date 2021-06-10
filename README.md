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

![WhatsApp Image 2021-06-10 at 12 02 54](https://user-images.githubusercontent.com/33164047/121569991-0563ff80-c9e7-11eb-98cc-32cfda79578c.jpeg)





