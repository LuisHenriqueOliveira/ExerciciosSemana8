import java.util.ArrayList;
import javax.swing.JOptionPane;
public class BlocoDeNotas{
   private ArrayList<String> notas;
   
   public BlocoDeNotas(){
      notas = new ArrayList<String>();
   }
   public void inserir(String nota){
      notas.add(nota);
      JOptionPane.showMessageDialog(null, "Sua nota foi adicionada!");
   }
   public void remover(int indice){
      notas.remove(indice-1);
   }
   public String buscarNota(int indice) {
      return buscar(indice-1);
   }
   private String buscar(int indice){
      String nota = notas.get(indice);
      return nota;
   }
   public void imprimir(){
      String resp = "";
      for (int i = 0; i < notas.size(); i++) {
         resp = resp + notas.get(i) + "\n";
      }
      JOptionPane.showMessageDialog(null, resp);
   }
   public int getSize() {
      return notas.size();
   }
}