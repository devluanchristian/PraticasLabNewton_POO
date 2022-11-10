

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    CelularA celDoJoao = new CelularA(980);
    CelularB celDaMaria = new CelularB(1200);

    JOptionPane.showMessageDialog(null, celDoJoao.detalhes());
    JOptionPane.showMessageDialog(null, celDaMaria.detalhes());

  }
}
