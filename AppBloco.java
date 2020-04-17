import javax.swing.*;
public class AppBloco{
    public static void main(String[] args){
        BlocoDeNotas bloco = new BlocoDeNotas();
        String nota;
        int indice;
        String menu = "Digite:\n1 - Inserir nota\n2 - Remover nota\n3 - Alterar nota\n4 - Listar notas\n5 - Sair";
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcao){
                
                case 1:
                    nota = JOptionPane.showInputDialog("Digite o que deseja inserir:");
                    bloco.inserir(nota);
                    break;
            
                case 2:
                    indice = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da nota que deseja remover:"));
                    if (indice >= bloco.getSize()) {
                        JOptionPane.showMessageDialog(null, "Esse indice nao existe!");                    
                    } else {
                        bloco.remover(indice);
                        JOptionPane.showMessageDialog(null, "Nota removida.");
                    }
                    break;
            
                case 3:
                    indice = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da nota que deseja alterar:"));
                    if (indice-1 >= bloco.getSize()) {
                        JOptionPane.showMessageDialog(null, "Esse indice nao existe!");
                    } else {
                        bloco.remover(indice);
                        String alteracao = JOptionPane.showInputDialog("Digite a nova nota:");
                        bloco.inserir(alteracao);
                    }
                    break;
                case 4:
                    bloco.imprimir();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Tchau, até a proxima!");   
            }       
        } while (opcao != 5);
    }
}