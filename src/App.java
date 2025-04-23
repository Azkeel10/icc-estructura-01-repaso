
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan",25),
            new Persona("Maria",30),
            new Persona("Carlos",22),
            new Persona("Ana",28),
            new Persona("Luis",35),
            new Persona("Sofia",27),
            new Persona("Miguel",40),
            new Persona("Laura",32),
            new Persona("Pedro",39),
            new Persona("Elena",26)
        };
//-------------------------------------------------------------------------------------------------------------
        
        //0.Instanciar clases necesarias
        PersonaController pC = new PersonaController();
        ViewConsole vC = new ViewConsole();
        //1.Mensaje= arreglo personas
        vC.printMessage("-----Arreglo personas-----\n");
        //2.Imprmir arreglo
        vC.printPersonaArray(personas);
        //3.Mensaje= Arreglo ordenado por insercion ascendente
        vC.printMessage("-----Arreglo ordenado por insercion ascendente-----\n");
        //4.Imprimir el arreglo ordenado
        pC.ordenarPorEdad(personas);
        vC.printPersonaArray(personas);
        //5.Mensaje = buscar persona con edad 40
        vC.printMessage("-----Buscar persona1 con edad 40-----\n");
        //6.IMprimir personna de busqueda y persona si se encuentra
        Persona buscarPer1 = pC.buscarPorEdad(personas, 40);
        if (buscarPer1 == null){
            vC.printMessage("No encontrada");
        } else {
            vC.printMessage("\nEncontrada es: " );
            vC.printMessage(buscarPer1.toString());
        }
        //7.Mensaje = buscar persona con edad 99
        vC.printMessage("\n-----Buscar persona2 con edad 99-----\n");
        //8.Imprimir personna de busqueda y persona si se encuentra
        Persona buscarPer2 = pC.buscarPorEdad(personas, 99);
        if (buscarPer2 == null){
            vC.printMessage("No encontrada");
        } else {
            vC.printMessage("Encontrada es: " );
            vC.printMessage(buscarPer2.toString());
        }
        
        // TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        // LA EDAD


    }
}
