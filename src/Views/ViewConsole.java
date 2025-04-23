package Views;

import Models.Persona;

public class ViewConsole {
//-------------------------------------------------------------------------------------------------------------
    public void printPersonaArray(Persona[] personas){
        int tam = personas.length;
    
        for(int i = 0; i < tam; i ++){   
            System.out.print( personas[i] + " - ");
        }
        System.out.println();
    }
//-------------------------------------------------------------------------------------------------------------
    public void printMessage(String message){
        System.out.print(message);
    }
}
