/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta;

import Excepciones.DatosIncorrectos;
import Excepciones.LimiteSaldo;

/**
 *
 * @author juank
 */
public class Cuenta {

    private float saldo;
    private final int idCuenta;
    
    public Cuenta(int idCuenta, float saldo){
        
        this.saldo = saldo;
        this.idCuenta = idCuenta;
    
    }
    

    public float balance(){
    
        return 0;
    }
    
    public float retiro(float cantidad) throws DatosIncorrectos, LimiteSaldo{
         if(cantidad <= 0){
            throw new DatosIncorrectos("El saldo que se desea retirar es negativo. Introduzca cantidad positiva");
        }else if(cantidad > 500){
            throw new DatosIncorrectos("El saldo que se desea retirar excede de 500€ para " + cantidad + " en retiro");
        }
        
        else {
            //SI LA CANTIDAD QUE DESEAMOS SACAR HACE QUE NUESTRA CUENTA QUEDE EN MENOS DE -500.0, SALTARÁ ERROR.
            if((this.saldo-cantidad) < -500.0){
                throw new LimiteSaldo("El saldo que se desea retirar excede de 500€ para " + cantidad + " en retiro");
            }
            //Si no deja la cuenta en menos de -500.0
            else{
                this.saldo= this.saldo- cantidad;
            }
        }        
        return this.saldo;    }
    
    
    public float ingreso(float ingreso) throws DatosIncorrectos{
         if(ingreso<= 0){
            throw new DatosIncorrectos("El saldo que se desea ingresar es negativo. Introduzca cantidad positiva");
        }
        else this.saldo+=ingreso;
        
        return this.saldo;       
    }
    
  
    
    
    
}
