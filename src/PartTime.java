public final class PartTime extends Trabajador{
    private short valorHora;
    private short horasTrabajadas;

    public PartTime(String codigo, Region r){
        super(codigo, r);
    }
    public PartTime(String codigo, Region r, short valorHora, short cantidadHoras){
        super(codigo, r);
        this.setValorHora(valorHora);
        this.setHorasTrabajadas(cantidadHoras);
    }

    public void setValorHora(short nuevo){
        if(nuevo >= 1500 && nuevo <= 4300){
            this.valorHora = nuevo;
        }else{
            System.out.println("El valor de la hora tiene que estar en el intervalo de 1500 a 4300.");
        }
    }

    public void setHorasTrabajadas(short horas){
        if(horas >= 1 && horas <= 20){
            this.horasTrabajadas = horas;
        }else{
            System.out.println("La cantidad de horas tiene que estar en el intervalo de 1 a 20.");
        }
    }

    @Override
    public String toString() {
        return "[" + valorHora + "] por hora con [" + horasTrabajadas + "] horas";
    }

    public int calcularSueldo(){
        int sueldo = this.sueldoBase + (horasTrabajadas * valorHora);
        return sueldo;
    }

}
