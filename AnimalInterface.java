/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UR
 */
class AnimalInterface implements Cat, Dog 
{
public void bark()
{
System.out.println("bow bow");
}
public void meow()
{
System.out.println("meow meow");
}  
}

interface Dog 
{    
public void bark ();
}

interface Cat 
{
public void meow(); 
}

 




