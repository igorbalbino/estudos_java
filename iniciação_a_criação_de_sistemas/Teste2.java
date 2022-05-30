import javax.swing.JOptionPane;

public class Teste2{
	private static int N_COMANDAS = 0;
	
	public static void main(String[] args){
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		String pedido = JOptionPane.showInputDialog("Digite o pedido: ");
		
		N_COMANDAS = N_COMANDAS+1;

		JOptionPane.showMessageDialog(null, "Nome: "+nome+" - Numero da comanda:"+N_COMANDAS+" - Pedido: "+pedido,"Informação",JOptionPane.INFORMATION_MESSAGE);
	}
}