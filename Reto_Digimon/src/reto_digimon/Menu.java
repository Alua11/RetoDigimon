/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_digimon;

/**
 *
 * @author Alvaro
 */
public class Menu {

   
   public String AltaUsuario="";
   public String Contraseña="";
   
   public Menu (String AltaU,String Contra){
   
   AltaUsuario=AltaU;
   Contraseña=Contra;
   
   }
   
    public String getAltaUsuario() {
        return AltaUsuario;
    }

    public void setAltaUsuario(String AltaUsuario) {
        this.AltaUsuario = AltaUsuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
       this.Contraseña = Contraseña;
    }
   
   
}
