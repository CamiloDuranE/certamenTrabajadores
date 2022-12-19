public abstract class Trabajador implements iOperable{
    private String codigo;
    private Region region;

    public Trabajador(String codigo){
        this.setCodigo(codigo); 
    }
    public Trabajador(String codigo, Region r){
        this.setCodigo(codigo);
        this.setRegion(r);
    }

    public String getCodigo(){
        return this.codigo;
    }
    public void setCodigo(String codigo){
        if((codigo.charAt(0) == 'T') && (codigo.length() < 5)){
            this.codigo = codigo;
        }else{
            System.out.println("No cumple con las indicaciones propuestas...");
        }
        
    }

    public void setRegion(Region region){
        this.region = region;
    }
    public Region getRegion(){
        return this.region;
    }

    public boolean sonCoterranos(Trabajador otro){
        return true;
    }

    @Override
    public String toString() {
        return codigo + region;
    }

    public boolean equals(Trabajador t){
        if (this == t) {
            return true;
        }
        if (t == null) {
            return false;
        }
        if (getClass() != t.getClass()) {
            return false;
        }
        final Trabajador other = (Trabajador) t;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

}
