
package projproduto;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        Produto objProduto1 = new Produto();
        Produto objProduto2 = new Produto();
        
        String nome1 = JOptionPane.showInputDialog("Informe o nome do produto 1: ");
        String descricao1 = JOptionPane.showInputDialog("Informe a descrição do produto 1: ");
        double valorUnitario1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor unitário do produto 1: "));
        double quantidade1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade do produto 1: "));
        String nome2 = JOptionPane.showInputDialog("Informe o nome do produto 2: ");
        String descricao2 = JOptionPane.showInputDialog("Informe a descrição do produto 2: ");
        double valorUnitario2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor unitário do produto 2: "));
        double quantidade2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade do produto 2: "));
        
        objProduto1.setNome(nome1);
        objProduto1.setDescricao(descricao1);
        objProduto1.setValorUnitario(valorUnitario1);
        objProduto1.setQuantidade(quantidade1);
        objProduto1.calcularValorTotal();
        
        objProduto2.setNome(nome2);
        objProduto2.setDescricao(descricao2);
        objProduto2.setValorUnitario(valorUnitario2);
        objProduto2.setQuantidade(quantidade2);
        objProduto2.calcularValorTotal();
        
        JOptionPane.showMessageDialog(null, "Dados dos Produto" +
                "\n\nProduto 1" +
                "\nNome: " + objProduto1.getNome() +
                "\nDescrição: " + objProduto1.getDescricao() +
                "\nValor unitário: R$" + objProduto1.getValorUnitario() +
                "\nQuantidade: " + objProduto1.getQuantidade() +
                "\nValor total: R$" + objProduto1.calcularValorTotal() +
                "\n\nProduto 2" +
                "\nNome: " + objProduto2.getNome() +
                "\nDescrição: " + objProduto2.getDescricao() +
                "\nValor unitário: R$" + objProduto2.getValorUnitario() +
                "\nQuantidade: " + objProduto2.getQuantidade() +
                "\nValor total: R$" + objProduto2.calcularValorTotal());
        
    }
}
