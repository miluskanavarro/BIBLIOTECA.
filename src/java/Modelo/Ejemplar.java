/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Swift
 */
public class Ejemplar {
    private int idejemplar;
    private int idlibro;
    private int num_ejemplar;
    private int fechasalida;
    private String origen;
    private String estado;

    public Ejemplar() {
    }

    public Ejemplar(int idejemplar, int idlibro, int num_ejemplar, int fechasalida, String origen, String estado) {
        this.idejemplar = idejemplar;
        this.idlibro = idlibro;
        this.num_ejemplar = num_ejemplar;
        this.fechasalida = fechasalida;
        this.origen = origen;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdejemplar() {
        return idejemplar;
    }

    public void setIdejemplar(int idejemplar) {
        this.idejemplar = idejemplar;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public int getNum_ejemplar() {
        return num_ejemplar;
    }

    public void setNum_ejemplar(int num_ejemplar) {
        this.num_ejemplar = num_ejemplar;
    }

    public int getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(int fechasalida) {
        this.fechasalida = fechasalida;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    
    
}
