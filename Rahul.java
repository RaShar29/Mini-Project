import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rahul extends Applet {
    @Override
    public void init() {
        TextArea area = new TextArea("");
        Button btn = new Button("Paint");

        area.setPreferredSize(new Dimension(300, 30));

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paint(getGraphics(), area.getText(), 60, 60);
            }
        });

        add(area);
        add(btn);

    }

    public void paint(Graphics g, String name, int stx, int sty) {
        int i=0;
        int siz = 20;
        try {
            g.drawRect(0, 0, 700, 700);
            while (i < name.length()) {
                g.setFont(new Font("Monospace", Font.PLAIN, siz));
                g.drawString(String.valueOf(name.charAt(i)), stx, sty);
                i++;
                sty = sty + 20 + siz;
                siz += 30;

            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
