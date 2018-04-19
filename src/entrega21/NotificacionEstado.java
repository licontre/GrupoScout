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
public class NotificacionEstado implements Serializable {

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
     private String estado;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @ManyToOne
    private Usuario notificaciones;
    @ManyToOne
    private Documento registro;
    
    public Documento getRegistro(){
        return this.registro;
    }
    public void setRegistro(Documento n){
        this.registro = n;
    }
    
    public Usuario getUsuario(){
        return notificaciones;
    }
    public void setUsuario(Usuario n){
        this.notificaciones = n;
    }
    
    public String getEstado (){
        return estado;
    }
    public void setEstado (String n){
        this.estado = n;
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
        if (!(object instanceof NotificacionEstado)) {
            return false;
        }
        NotificacionEstado other = (NotificacionEstado) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "grupoScouts.NotificacionEstado[ id=" + getId() + " ]";
    }
    
}