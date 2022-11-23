import javax.swing.JFrame;


public class Main {
    public static void main(String[] args){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Aizvērt poga 
        window.setResizable(false);//Nevar mainīt loga izmērus
        window.setTitle("Spele");//Nosaukums


        GamePanel GamePanel = new GamePanel();
        window.add(GamePanel);//Pievienoju logam Menu

        window.pack();//Lai menu ieklaujas loga to iepakoju taja

        window.setLocationRelativeTo(null);//Loga novietojums
        window.setVisible(true);//Loga redzamība
    }
}
