package br.com.petlove.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Estado implements Serializable {

    @Id
//    @SequenceGenerator(name = "estado_seq", allocationSize = 1,sequenceName = "seq_estado_id",initialValue = 29)
//    @GeneratedValue(generator = "estado_seq",strategy = GenerationType.SEQUENCE)
     private Integer id_estado;
    @Column(name = "uf_estado", nullable = true, length = 3)
     private String uf_estado;
    @Column(name = "nome", nullable = true, length = 50)
     private String nome;

     public Estado(){}
     
    /**
     * @return the id_estado
     */
    public Integer getId_estado() {
        return id_estado;
    }

    /**
     * @param id_estado the id_estado to set
     */
    public void setId_estado(Integer id_estado) {
        this.id_estado = id_estado;
    }

    /**
     * @return the uf_estado
     */
    public String getUf_estado() {
        return uf_estado;
    }

    /**
     * @param uf_estado the uf_estado to set
     */
    public void setUf_estado(String uf_estado) {
        this.uf_estado = uf_estado;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id_estado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estado other = (Estado) obj;
        if (!Objects.equals(this.id_estado, other.id_estado)) {
            return false;
        }
        return true;
    }


}