import javax.swing.JFrame;


public class GamePanel {
    public static void GamePanel(String[] args){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Aizvērt poga 
        window.setResizable(false);//Nevar mainīt loga izmērus
        window.setTitle("Spele");//Nosaukums


        GamePanel GamePanel = new GamePanel();
        window.add(GamePanel);//Pievienoju logam GamePanel

        window.pack();//Lai GamePanel ieklaujas loga to iepakoju taja

        window.setLocationRelativeTo(null);//Loga novietojums
        window.setVisible(true);//Loga redzamība

        gamePanel.startGameThread();
    }
}
