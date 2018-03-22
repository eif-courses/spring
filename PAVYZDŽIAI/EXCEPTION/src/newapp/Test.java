/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newapp;

/**
 *
 * @author Marius
 */
class Test
{
    public String getID(int i) throws AppException
    {
        if (i == 0)
        {
            throw new AppException("Prašome nurodyti bet kurią kitą reikšmę, išskyrūs 0");
        }
        else
        {
            return "ne nulis";
        }
    }
  public static void compute(int i ) throws AppException{
    
      System.out.println( "Skaičiuojamas rezultatas( " + i + ") "); 
      if (i > 10 ){ 
          throw new AppException("Apskaičiuoti nepavyko kadangi reikšmė didesnė už 10"+ i );
      } 
      System.out.println( "Sėkmingai apskaičiuotas");
  }

  
}
