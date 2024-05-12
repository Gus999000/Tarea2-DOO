package org.example;

import java.time.Instant;
import java.util.ArrayList;

public class Invitacion {
    private int idReunion;
    private ArrayList<Integer> listaInvitados;
    private Instant hora;
    private Reunion reunion;
    private Invitable invitable;

    public Invitacion(int idReunion, ArrayList<Integer> listaInvitados, Instant hora, Reunion reunion, Invitable invitable) {
        this.idReunion = idReunion;
        this.listaInvitados = listaInvitados;
        this.hora = hora;
        this.reunion = reunion;
        this.invitable = invitable;
    }

    public void enviarInvitacion() {
        System.out.println("Invitación enviada a: " + listaInvitados);
    }

    public void actualizarInvitados(ArrayList<Integer> nuevosInvitados) {
        this.listaInvitados = nuevosInvitados;
        System.out.println("Lista actualizada: " + listaInvitados);
    }

    public ArrayList<Integer> obtenerListaInvitados() {
        return listaInvitados;
    }

    public void agregarInvitado(int idEmpleado) {
        this.listaInvitados.add(idEmpleado);
        System.out.println("Agregado: " + idEmpleado);
    }

    public void eliminarInvitado(int idEmpleado) {
        this.listaInvitados.remove(Integer.valueOf(idEmpleado));
        System.out.println("Eliminado: " + idEmpleado);
    }

    // Getters y Setters para el atributo hora
    public Instant getHora() {
        return hora;
    }

    public void setHora(Instant hora) {
        this.hora = hora;
    }
}
