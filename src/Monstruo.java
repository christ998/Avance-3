import java.util.Random;
import java.util.ArrayList;
public class Monstruo {
    
  private int hp;
  private int atk;
  private int def;
  private int spd;
  
  public Monstruo(){
  crearMonstruo();
  } // El constructor se encargará de crear los monstruos (objetos de la clase Monstruo) con sus respectivos atributos
  
 private void setHp(){
 this.hp = (int)(Math.random()*500+3500);
 }
 public int getHp(){
 return this.hp;
 }
 private void setAtk(){
 this.atk = (int)(Math.random()*500+1000);
 }
 public int getAtk(){
 return this.atk;
 }
 private void setDef(){
 this.def = (int)(Math.random()*20+5);
 }
 public int getDef(){
 return this.def;
 }
 private void setSpd(){
 this.spd = (int)(Math.random()*90+10);
 }
 public int getSpd(){
 return this.spd;
 }
 private void crearMonstruo(){
  setHp();
  setAtk();
  setDef();
  setSpd();
 }
 private ArrayList<ObjetoEquipable> objeto(){
 ArrayList <ObjetoEquipable> dropeos = new ArrayList<>();
 return dropeos;
 }
 private void crearObjetoDropeable(ArrayList <ObjetoEquipable> array){
 array.add(new ObjetoEquipable());
 }
 public void mostrarObjetoDropeable(ArrayList <ObjetoEquipable> array){
     System.out.println("Nombre: "+array.get(0).getNombreArma());    
     System.out.println("El objeto mejora: "+array.get(0).getCarac());
     System.out.println("Tiene un rango de: "+array.get(0).getRango());
     System.out.println("Tiene una mejora total de: "+array.get(0).getMejora());
     System.out.println("-------------------------------------------");
 }
}
