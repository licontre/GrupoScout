/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrega21;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
public class Asistencia implements Serializable {

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

    public enum Opcion { SI, NO }
    
    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private String observacion;
    @Enumerated(EnumType.STRING)
    private Opcion confirmacion;
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    private Evento asistencia;
    
    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario(Usuario n){
        this.usuario = n;
    }    
    
    public String getObservacion (){
        return observacion;
    }
    public void setObservacion (String n){
        this.observacion = n;
    }
    public Date getFecha (){
        return fecha;
    }
    public void setFecha (Date n){
        this.fecha = n;
    }
    public Long getId() {
        return id;
    }
    public Opcion getConfirmacion(){
        return confirmacion;
    }
    public void setConfirmacion(Opcion n){
        this.confirmacion = n;
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
        if (!(object instanceof Asistencia)) {
            return false;
        }
        Asistencia other = (Asistencia) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "grupoScouts.Asistencia[ id=" + getId() + " ]";
    }
    
}
