/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Marius
 */
// Klasė Position priskirti objektą plokštumoje pagal įvestas koordinates x ir y 
class Position{ 
    // Koordinatės x ir y 
    int x; 
    int y; 
 
    // Metodas skirtas priskirti koordinates plokštumoje 
    void setPosition(int x, int y){ 
        // Gautos koordinatės, toliau atliekamas bet koks veiksmas su šiais duomenimis 
        System.out.println("Koordinat? x:" + x + "Koordinat? y:" + y); 
    } 
} 
