// ESTRUTURA IF ELSE SWITCH - EXERCICIO 18 JAVA (UNISUL)

package ws.estruturaifswitch2;
import javax.swing.JOptionPane;
public class Estruturaifswitch2 {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Qual seu nome?");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço?"));
        String category = JOptionPane.showInputDialog("\n a- 10% \n b- 15% \n c- 20% \n d- 25% \n e- 50%");
        double promo, end;
        char categoryCHAR = category.charAt(0);
        switch (categoryCHAR){
            case 'a':
               promo = price * 0.1;
               end = price - promo;
               JOptionPane.showMessageDialog(null, "O preço com desconto ficou: R$ " + end);
               break;
            case 'b':
               promo = price * 0.15;
               end = price - promo;
               JOptionPane.showMessageDialog(null, "O preço com desconto ficou: R$ " + end);
               break;
            case 'c':
               promo = price * 0.2;
               end = price - promo;
               JOptionPane.showMessageDialog(null, "O preço com desconto ficou: R$ " + end);
               break;
            case 'd':
               promo = price * 0.25;
               end = price - promo;
               JOptionPane.showMessageDialog(null, "O preço com desconto ficou: R$ " + end);
               break;
            case 'e':
               promo = price * 0.5;
               end = price - promo;
               JOptionPane.showMessageDialog(null, "O preço com desconto ficou: R$ " + end);
               break;
        }
    }
}
