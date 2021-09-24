# ¿Que son las interfaces listener en java... 🤔 ? #
En Java :computer: , cada evento está representado por un objeto que es una subclase de la clase **EventObject** en el paquete java.util. Cada subclase de EventObject representa un tipo de evento particular. Por ejemplo:

* **MouseEvent** 🖱️, para representar acciones del ratón: mover, arrastrar, hacer clic en un botón del ratón, etc.

* **KeyEvent** ⌨️, para representar acciones del teclado, esto es, pulsar teclas.

* **ActionEvent** ❗, para representar un acción del usuario en la interfaz, por ejemplo, pulsar un botón en la pantalla.

Cualquier clase puede recibir y manejar los eventos ✔️.
Normalmente:

* componentes generarán eventos en respuesta a las acciones de los usuarios.
objetos del usuario escucharán y atenderán los eventos generados 😎.

Los objetos escuchadores 👂 deben registrarse en los generadores para que estos les envien los eventos ▶️.

Cuando se produce un evento ❗ , el generador invoca un método en todos los objetos escuchadores registrados 👂.

El método que se invoca depende del tipo de evento 📢.
Estos métodos se definen en varias interfaces llamadas escuchadoras 👂.

Las clases escuchadoras deben implementar las interfaces escuchadores asociadas a los tipos de eventos que quieran atender 👀.

Interfaz | Métodos
---------|--------
ActionListener|actionPerformed(ActionEvent)
AdjustmentListener|adjustmentValueChanged(AdjustmentEvent)
ComponentListener ComponentAdapter| componentHidden(componentEvent) componentShown(componentEvent) componentMoved(componentEvent) componentResized(componentEvent)
FocusListener FocusAdapter | focusGained(FocusEvent) focusLost(FocusEvent)
KeyListener KeyAdapter | keyPressed (KeyEvent), keyReleased (KeyEvent), keyType (KeyEvent)
MouseListener MouseAdapter |  mouseClicked(MouseEvent) mouseEntered(MouseEvent) mouseExited(MouseEvent)  mousePressed(MouseEvent)  mouseReleased(MouseEvent)
MouseMotionListener MouseMotionAdapte| mouseDragged(MouseEvent) mouseMoved(MouseEvent)
WindowListener WindowAdapter| windowOpened(WindowEvent) windowClosing(WindowEvent) windowClosed(WindowEvent) windowActivated(WindowEvent) windowDeactivated(WindowEvent) windowIconified(WindowEvent) windowDeiconified(WindowEvent)
ItemListener |itemStateChanged(itemEvent)
TextListener | 	textValueChanged(TextEvent)