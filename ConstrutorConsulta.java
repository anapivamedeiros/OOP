public class ConstrutorConsulta {
    public static void main (String [] args){
        Consulta consulta1= new Consulta();
        Consulta consulta2= new Consulta ("09/08/2025");
        Consulta consulta3= new Consulta ("09/08/2025", "Manuela" );
        Consulta consulta4= new Consulta ("09/08/2025", "Manuela", "Maria" );

        System.out.println ("-------- Detalhes das Consultas: -------");
        System.out.println ("----- Consulta 01 -----");
        System.out.println ("----- Consulta 02 -----");
        System.out.println ("Data:"+consulta2.getData());
        System.out.println ("----- Consulta 03 -----");
        System.out.println ("Data:"+consulta3.getData());
        System.out.println ("Nome do Paciente: "+consulta3.getNomePaciente());
        System.out.println ("----- Consulta 04 -----");
        System.out.println ("Data:"+consulta4.getData());
        System.out.println ("Nome do Paciente: "+ consulta4.getNomePaciente());
        System.out.println ("Nome do Dentista: "+ consulta4.getNomeDentista());
    }
}