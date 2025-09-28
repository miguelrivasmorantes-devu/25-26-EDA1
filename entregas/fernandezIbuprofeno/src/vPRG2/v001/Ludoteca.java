package vPRG2.v001;

import utils.Console;

class Ludoteca {
    private Monitor lydia;
    private Monitor aisha;

    public Ludoteca(Monitor lydia, Monitor aisha){
        this.lydia = lydia;
        this.aisha = aisha;
    }

    public void recibirNiño(Niño niño) {
        lydia.recibeNiño(niño);
    }

    public void actualizar() {
        gestionarNiños();
        if (aisha.puedeJugar()) {
            aisha.jugar();
        } 
    }

    private void gestionarNiños() {
        if (lydia.tieneNiños() && !aisha.estaJugando()) {
            lydia.transferirHastaLlenar(aisha);
        }        
    }

    public void verEstado(){
        lydia.mostrarListaNiños();
        aisha.mostrarListaNiños();
        
        new Console().writeln ("Uso de arrays: Lydia " + lydia.getUsoMemoria() + ", Aisha " + aisha.getUsoMemoria());
    }
}
