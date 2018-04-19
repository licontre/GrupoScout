/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrega21;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author root
 */
@Entity
public class NotificacionEvento implements Serializable {

    /**
     * @param noteventos the noteventos to set
     */
    public void setNoteventos(Evento noteventos) {
        this.noteventos = noteventos;
    }

    /**
     * @return the noteventos
     */
    public Evento getNoteventos() {
        return noteventos;
    }

    /**
     * @param noteventos the noteventos to set
     */
    public void setNoteventos(NotificacionEvento noteventos) {
        this.setNoteventos(noteventos);
    }

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
    private String descripcion;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    private Evento noteventos;
    
    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario(Usuario n){
        this.usuario = n;
    }    
    
    public String getDescripcion (){
        return descripcion;
    }
    public void setDescripcion (String n){
        this.descripcion = n;
    }
    public Date getFecha(){
        return fecha;
    }
    public void setFecha(Date n){
        this.fecha = n;
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
        if (!(object instanceof NotificacionEvento)) {
            return false;
        }
        NotificacionEvento other = (NotificacionEvento) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "grupoScouts.Notificaciones[ id=" + getId() + " ]";
    }
    
}
