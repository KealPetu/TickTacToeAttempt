package frontEnd;

import java.awt.event.MouseEvent;

public class GamePlayPanel extends GamePanel {
    public GamePlayPanel() {
        super();
        graficos.drawLine((int)(PANEL_RESOLUTION_X / 3), 0, (int)(PANEL_RESOLUTION_X / 3), PANEL_RESOLUTION_Y);
        graficos.drawLine((int)(PANEL_RESOLUTION_X * 2/ 3), 0, (int)(PANEL_RESOLUTION_X * 2/ 3), PANEL_RESOLUTION_Y);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
