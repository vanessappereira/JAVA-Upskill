package Aula6Objectos.Aulas;
/*
Desenvolva uma classe para representar retângulos, tendo em conta a sua
largura e comprimento. Os objetos retângulo deverão ser imutáveis, isto é,
uma vez criado as suas dimensões não podem ser alteradas.

 */
public class Ex3 {
   private int comp;
    private final int larg;
    public Ex3(int comp, int larg) {
        this.comp = comp;
        this.larg = larg;
    }
    public Ex3(int lado) {
        this.comp = lado;
        this.larg = lado;
    }
    public int getComp() {
        return comp;
    }
    public int getLarg() {
        return larg;
    }
    public int area(){
        return comp*larg;
    }
    public int perimetro(){
        return 2*(comp*larg);
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(comp, 2)+Math.pow(larg,2)) ;
    }
    public int isSquare(){
        return comp=larg;

    }



}
/*
public double diagonal(){
        int catetoA2=comp+comp;
        int catetoB2=larg*larg;
        int somaCatetos=catetoA2+catetoB2
        return Math.sqrt(somaCatetos);

       public boolean isSquare(){
        if(comp=larg){
            return true;
        }else{
        return false;
        }
*/