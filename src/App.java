public class App {
    public static void main(String[] args) throws Exception {
        Region region = new Region("Talca");

        
      

        PartTime trabajador_1  = new PartTime("T001", region, (short)2500, (short)20);
        System.out.println("[" + trabajador_1.getCodigo() + "] - " + trabajador_1.toString() + " -> Sueldo : " +  trabajador_1.calcularSueldo());

        PartTime trabajador_2  = new PartTime("T002", region, (short)4300, (short)40);
        System.out.println("[" + trabajador_2.getCodigo() + "] - " + trabajador_2.toString() + " -> Sueldo : " +  trabajador_2.calcularSueldo());
    }
}
