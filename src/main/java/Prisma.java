
public class Prisma {
    int baseTriangulo;
    int alturaPrisma;

    Prisma (int baseTriangulo){
        this.baseTriangulo=baseTriangulo;
    }
    
    Prisma (int baseTriangulo, int alturaPrisma){
        this.baseTriangulo=baseTriangulo;
        this.alturaPrisma=alturaPrisma;
    }
    
    public int getBaseTriangulo(){
    return baseTriangulo;
    }
    
    public int getAlturaPrisma(){
    return alturaPrisma;
    }
    
    public void setAlturaPrisma(int alturaPrisma){
         this.alturaPrisma=alturaPrisma;
    }
    
    public float alturaTriangulo () {
        float alturaBase=(float) ((Math.sqrt(3)/2)*baseTriangulo);
        return alturaBase;
    }
    
    public float areaBase () {
        float area=(baseTriangulo*alturaTriangulo())/2;
        return area;
    }
    
    public float perimetro () {
        float perimeter=3*baseTriangulo;
        return perimeter;
    }
    
    public float areaLateral () { 
         float arealateral=perimetro()*alturaPrisma;
        return arealateral;
    }
    
    public float areaTotal () {
         float areatotal=2*areaBase()+areaLateral();
        return areatotal;
    }
    
}
