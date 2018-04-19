/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrega21;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author root
 */
@Entity
public class Documento implements Serializable {

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String estado;
    private String copiadocumento;
    private String tipo;
    private String ruta;
    private int numvisualizaciones;
    @OneToMany( mappedBy="registro")
    private List<NotificacionEstado> registro;
    @ManyToMany
    private List<Evento> eventos;
    
    public void setEventos(List<Evento> e){
        this.eventos = e;
    }
    public List<Evento> getEventos(){
        return eventos;
    }
    public void setRegistro(List<NotificacionEstado> n){
        this.registro = n;
    }
    public List<NotificacionEstado> getRegistro(){
        return registro;
    }    
    public int getNumvisualizaciones(){
        return numvisualizaciones;
    }
    public void setNumvisualizaciones(int n){
        this.numvisualizaciones = n;
    }
    public String getNombre (){
        return nombre;
    }
    public void setNombre (String n){
        this.nombre = n;
    }
    public String getEstado (){
        return estado;
    }
    public void setEstado (String n){
        this.estado = n;
    }
    public String getCopiadocumento (){
        return copiadocumento;
    }
    public void setCopiadocumento (String n){
        this.copiadocumento = n;
    }
    public String getTipo (){
        return tipo;
    }
    public void setTipo (String n){
        this.tipo = n;
    }
    public String getRuta (){
        return ruta;
    }
    public void setRuta (String n){
        this.ruta = n;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documento)) {
            return false;
        }
        Documento other = (Documento) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "grupoScouts.Documento[ id=" + getId() + " ]";
    }
    
}
