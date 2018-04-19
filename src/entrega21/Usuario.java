/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrega21;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author licontrex
 */
@Entity
public class Usuario implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
      public enum Sexo { HOMBRE , MUJER };
private String nombreusuario;
    private String nombre;
    private String apellidos;
    private String dni;
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;
    @Enumerated(EnumType.STRING)
    private Sexo genero;
    private String calle;
    private String codigopostal;
    private String localidad;
    private String provincia;
    private String cargo;
    private String email;
    private String password;
    private String fotoperfil;
    @OneToMany( mappedBy ="fechatransicion")
    private List<FechaEntrada> fechatransicion;
    @OneToMany( mappedBy ="usuario")
    private List<PagoCuota> pagoscuota;
    @Temporal(TemporalType.DATE)
    private Date fechaentrada;
    @Temporal(TemporalType.DATE)
    private Date fechabaja;
    @OneToMany( mappedBy="notificaciones")
    private List<NotificacionEstado> notificaciones; 
    @ManyToOne
    private Seccion lista;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entrega21.Usuario[ id=" + getId() + " ]";
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

    /**
     * @return the nombreusuario
     */
    public String getNombreusuario() {
        return nombreusuario;
    }

    /**
     * @param nombreusuario the nombreusuario to set
     */
    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the fechanacimiento
     */
    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    /**
     * @param fechanacimiento the fechanacimiento to set
     */
    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    /**
     * @return the genero
     */
    public Sexo getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Sexo genero) {
        this.genero = genero;
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the codigopostal
     */
    public String getCodigopostal() {
        return codigopostal;
    }

    /**
     * @param codigopostal the codigopostal to set
     */
    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the fotoperfil
     */
    public String getFotoperfil() {
        return fotoperfil;
    }

    /**
     * @param fotoperfil the fotoperfil to set
     */
    public void setFotoperfil(String fotoperfil) {
        this.fotoperfil = fotoperfil;
    }

    /**
     * @return the fechatransicion
     */
    public List<FechaEntrada> getFechatransicion() {
        return fechatransicion;
    }

    /**
     * @param fechatransicion the fechatransicion to set
     */
    public void setFechatransicion(List<FechaEntrada> fechatransicion) {
        this.fechatransicion = fechatransicion;
    }

    /**
     * @return the pagoscuota
     */
    public List<PagoCuota> getPagoscuota() {
        return pagoscuota;
    }

    /**
     * @param pagoscuota the pagoscuota to set
     */
    public void setPagoscuota(List<PagoCuota> pagoscuota) {
        this.pagoscuota = pagoscuota;
    }

    /**
     * @return the fechaentrada
     */
    public Date getFechaentrada() {
        return fechaentrada;
    }

    /**
     * @param fechaentrada the fechaentrada to set
     */
    public void setFechaentrada(Date fechaentrada) {
        this.fechaentrada = fechaentrada;
    }

    /**
     * @return the fechabaja
     */
    public Date getFechabaja() {
        return fechabaja;
    }

    /**
     * @param fechabaja the fechabaja to set
     */
    public void setFechabaja(Date fechabaja) {
        this.fechabaja = fechabaja;
    }

    /**
     * @return the notificaciones
     */
    public List<NotificacionEstado> getNotificaciones() {
        return notificaciones;
    }

    /**
     * @param notificaciones the notificaciones to set
     */
    public void setNotificaciones(List<NotificacionEstado> notificaciones) {
        this.notificaciones = notificaciones;
    }

    /**
     * @return the lista
     */
    public Seccion getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(Seccion lista) {
        this.lista = lista;
    }
    
}
