/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadelaboratorio2;
    
/**
 *
 * @author Jorge
 */
public class Usuarios {
   private String admin1, pass, telefono, correo;
   public void Usuarios(){
   
   }
   public String getNombreUsuarios(){
       return admin1;
   }
   public String getPassUsuarios(){
       return pass;
   }
   public String getTelefonoUsuarios(){
       return telefono;
   }
   public String getCorreoUsuarios(){
       return correo;
   }
   public void setNombreUsuarios(String admin1){
        this.admin1 = admin1;
   }
    public void setNombrePass(String pass){
        this.pass = pass;
   }
     public void setTelefonoUsuarios(String telefono){
        this.telefono = telefono;
   }
      public void setCorreoUsuarios(String correo){
        this.correo = correo;
   }
}
