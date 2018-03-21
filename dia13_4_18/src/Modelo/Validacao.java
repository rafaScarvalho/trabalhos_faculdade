/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author n221216
 */
public class Validacao extends absPropriedades
{

    
    public void Validar()
    {
        setMensagem("");
        try
        {
            setN1(Double.parseDouble(getNum1()));
           
        }
        catch (Exception e)
        {
            setMensagem("erro n1 \n");
        }
        
        try
        {
            setN2(Double.parseDouble(getNum2()));
        }
        catch (Exception e)
        {            
                setMensagem(getMensagem()+"erro n2 \n");            
        }
        
        if(getNum2().equals("0") && getOp().equals("/"))
        {
            setMensagem("Divisão por 0");
        }
            
            
        
        
    }
    
}
