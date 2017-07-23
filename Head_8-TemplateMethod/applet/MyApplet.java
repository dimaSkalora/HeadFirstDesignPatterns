package applet;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    String message;

    //Перехватчик init позволяет выпонить необходимые действия при инициализации приложения
    public void init() {
        message = "Hello World, I'm alive!";
        //repaint() - конкретный метод класса Applet, при помоши которого компоненнты высокого уровня
        //оповещаются о неоюходимости перерисолвки апплета
        repaint();
    }

    //позволяет выполнить необходимые действия непосредственно перед отображением апплета на веб странице
    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }

    //При переходе к другой странице перехватчик stop() дает приложению возможность
    // сделать все неоюходимое для завершения работы
    public void stop() {
        message = "Oh, now I'm being stopped...";
        repaint();
    }

    //Перехватчик используется перед уничтожениям приложения(напрмер при закритие браузера).
    //Здесь можно что нибудь вывести
    public void destroy() {
        message = "Goodbye, cruel world";
        repaint();
    }
 
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }
}

